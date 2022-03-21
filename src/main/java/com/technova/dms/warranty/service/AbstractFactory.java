package com.technova.dms.warranty.service;

public interface AbstractFactory<T, R> {
    R create(T type);
}
