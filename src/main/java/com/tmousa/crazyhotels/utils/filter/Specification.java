package com.tmousa.crazyhotels.utils.filter;

interface Specification<T> {
    boolean isSatisfied(T item);
}