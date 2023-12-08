package com.mezo.petclinic.service;

import java.util.*;

public class AbstractMapService<T,ID> {

    private Map<ID,T> data=new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(data.values());
    };

    T findById(ID id){
        return data.get(id);
    };

    T save(ID id,T object){
        data.put(id,object);
        return object;
    };

    void delete(T object){
        data.remove(object);
    };

    void deleteById(ID id){
        data.entrySet().removeIf(idtEntry -> idtEntry.equals(id));
    };
}
