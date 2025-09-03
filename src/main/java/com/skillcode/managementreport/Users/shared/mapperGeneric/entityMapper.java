package com.skillcode.managementreport.Users.shared.mapperGeneric;

import java.util.List;
import java.util.Set;

public interface entityMapper <D, E> {
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntity(List<D> dtoList);
    List<D> toDto(List<E> entityList);
    Set<D> toDto(Set<E> entityList);
}
