package com.skillcode.managementreport.Users.shared.mapperGeneric;

import java.util.List;

/**
 * Interfaz genérica para mapear entre DTOs, entidades JPA y modelos de dominio.
 *
 * @param <D> Tipo de los DTOs que se transfieren.
 * @param <E> Tipo de las entidades JPA.
 * @param <M> Tipo de los Modelos de dominio.
 */
public interface EntityMapper<D, E, M> {

    /**
     * Convierte un DTO en un modelo de dominio.
     *
     * @param dto Objeto DTO a convertir.
     * @return Modelo de dominio equivalente.
     */
    M dtoToDomain(D dto);

    /**
     * Convierte un modelo de dominio en un DTO.
     *
     * @param domain Modelo de dominio a convertir.
     * @return DTO equivalente.
     */
    D domainToDto(M domain);

    /**
     * Convierte una entidad JPA en un modelo de dominio.
     *
     * @param entity Entidad JPA a convertir.
     * @return Modelo de dominio equivalente.
     */
    M entityToDomain(E entity);

    /**
     * Convierte un modelo de dominio en una entidad JPA.
     *
     * @param domain Modelo de dominio a convertir.
     * @return Entidad JPA equivalente.
     */
    E domainToEntity(M domain);

    /**
     * Convierte una lista de DTOs en una lista de modelos de dominio.
     *
     * @param dtoList Lista de DTOs a convertir.
     * @return Lista de modelos de dominio equivalentes.
     */
    List<M> dtoToDomainList(List<D> dtoList);

    /**
     * Convierte una lista de modelos de dominio en una lista de DTOs.
     *
     * @param domainList Lista de modelos de dominio a convertir.
     * @return Lista de DTOs equivalentes.
     */
    List<D> domainToDtoList(List<M> domainList);

    /**
     * Convierte una lista de entidades JPA en una lista de modelos de dominio.
     *
     * @param entityList Lista de entidades a convertir.
     * @return Lista de modelos de dominio equivalentes.
     */
    List<M> entityToDomainList(List<E> entityList);

    /**
     * Convierte una lista de modelos de dominio en una lista de entidades JPA.
     *
     * @param domainList Lista de modelos de dominio a convertir.
     * @return Lista de entidades JPA equivalentes.
     */
    List<E> domainToEntityList(List<M> domainList);
}
