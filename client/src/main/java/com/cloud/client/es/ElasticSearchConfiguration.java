package com.cloud.client.es;

import com.google.common.net.InetAddresses;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class ElasticSearchConfiguration {


    @Value("${elastic.esServerIps}")
    private String esServerIps;
    @Value("${elastic.port}")
    private int port;

    private static  TransportClient  transPort;

    private static Settings settings =Settings.builder()
            .put("cluster.name", "JSJ-ES")
            .build();
    @Bean
    public TransportClient client() throws UnknownHostException {

        try {

            transPort = new PreBuiltTransportClient(settings);

            String esIps[] = esServerIps.split(",");
            for (String esIp : esIps) {//添加集群IP列表
                TransportAddress transportAddress =  new TransportAddress(
                        InetAddress.getByName(esIp),
                        port);
                transPort.addTransportAddresses(transportAddress);
            }

            return transPort;
        }catch (Exception e){
            e.printStackTrace();
            if (transPort != null){
                transPort.close();
            }
        }
        return null;
    }

}
