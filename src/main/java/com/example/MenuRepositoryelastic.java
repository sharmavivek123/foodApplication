package com.example;
import org.springframework.boot.autoconfigure.data.elasticsearch.Repository;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepositoryelastic extends ElasticsearchRepository< MenuRepositoryelastic,String> {


}
