package com.nettyrpc.test.client;

import java.util.List;

public interface HelloPersonService {
    List<Person> GetTestPerson(String name,int num);
}
