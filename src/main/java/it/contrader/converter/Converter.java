package it.contrader.converter;

import java.util.List;

/**
 * Created by paolo mascolo e angelo tozza on 26/02/2020.
 */
public interface Converter<Entity,DTO> {

	public Entity toEntity(DTO dto);
	
	public DTO toDTO(Entity entity);
	
	public List<DTO> toDTOList(Iterable<Entity> entityList);
	
	public List<Entity> toEntityList(Iterable<DTO> dtoList);

}