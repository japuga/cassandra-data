package com.csc.cassandradata.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table()

public class Customer {

    @PrimaryKeyColumn(value = "id", type = PrimaryKeyType.CLUSTERED)
    UUID id = UUID.randomUUID();

    @PrimaryKeyColumn(value = "first_name", type = PrimaryKeyType.PARTITIONED)
    String firstName;

    @PrimaryKeyColumn(value = "last_name", type = PrimaryKeyType.PARTITIONED)
    String lastName;

    @Column
    Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
