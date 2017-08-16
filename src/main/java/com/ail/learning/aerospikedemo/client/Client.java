package com.ail.learning.aerospikedemo.client;

import com.aerospike.client.AerospikeClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Value("${demo.aerospike.hostname:127.0.0.1}")
    private String hostname;

    @Value("${demo.aerospike.port:3000}")
    private int port;


    public AerospikeClient getClient() {
        //TODO 1. Create a new Aerospike client and return this client
        AerospikeClient newClient = new AerospikeClient(hostname,port);
        return newClient;
    }
}
