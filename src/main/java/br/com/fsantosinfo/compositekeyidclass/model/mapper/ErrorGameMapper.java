package br.com.fsantosinfo.compositekeyidclass.model.mapper;

import org.mapstruct.Mapper;

import br.com.fsantosinfo.compositekeyidclass.model.ErrorGame;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameRequestDTO;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameResponseDTO;

@Mapper(componentModel = "spring")
public interface ErrorGameMapper {

    ErrorGameResponseDTO toErrorGameResponseDTO(ErrorGame errorGameModel);
    ErrorGame toErrorGameModel(ErrorGameRequestDTO errorGameRequestDTO);
}
