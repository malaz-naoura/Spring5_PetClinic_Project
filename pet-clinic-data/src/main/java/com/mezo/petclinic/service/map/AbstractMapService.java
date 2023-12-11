package com.mezo.petclinic.service.map;

import com.mezo.petclinic.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    private final Map<ID, T> data = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(data.values());
    }

    T findById(ID id) {
        return data.get(id);
    }

    T save(T object) {
        if (object == null)
            throw new RuntimeException("object can not be null");

        Long new_id = object.getId();

        if (new_id == null) {
            new_id = getNextId();
        }

        object.setId(new_id);
        data.put((ID) new_id, object);
        return object;
    }

    void delete(T object) {
        data.remove(object);
    }

    void deleteById(ID id) {
        data.entrySet().removeIf(idtEntry -> idtEntry.getKey().equals(id));
    }

    Long getNextId() {
        if (data.size() == 0)
            return 1L;
        else return Collections.max(data.keySet()).longValue() + 1;
    }
}
