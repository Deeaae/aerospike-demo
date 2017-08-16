package com.ail.learning.aerospikedemo.service;

import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.WritePolicy;
import com.ail.learning.aerospikedemo.article.ArticleMetaData;
import com.ail.learning.aerospikedemo.client.Client;
import org.luaj.vm2.ast.Str;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleService {

    @Value("${demo.aerospike.namespace:test}")
    String namespace;

    @Value("${demo.aerospike.namespace:set:demo}")
    String set;

    @Autowired
    Client client;

    public ArticleMetaData create(ArticleMetaData articleMetaData) {

        return null;
    }

    public ArticleMetaData getArticleMetaData(UUID articleMetaDataId)
    {
        return null;
    }

    public List<ArticleMetaData> searchByUser(String username) {
        return null;
    }

    public List<ArticleMetaData> getTopNArticleWithLikes(int n) {
        return null;
    }

    public ArticleMetaData addLikes(UUID articleMetaDataId ) {
        return null;
    }

    public ArticleMetaData addDisLikes(UUID articleMetaDataId ) {
        return null;
    }


}
