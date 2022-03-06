package br.com.fsantosinfo.compositekeyidclass.model.mapper;

import br.com.fsantosinfo.compositekeyidclass.model.ErrorGame;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameRequestDTO;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-06T17:30:54-0300",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class ErrorGameMapperImpl implements ErrorGameMapper {

    @Override
    public ErrorGameResponseDTO toErrorGameResponseDTO(ErrorGame errorGameModel) {
        if ( errorGameModel == null ) {
            return null;
        }

        Integer errorCode = null;
        String errorMessage = null;
        Long errorSequenceNumber = null;
        Long gameId = null;
        String gamePlatform = null;

        errorCode = errorGameModel.getErrorCode();
        errorMessage = errorGameModel.getErrorMessage();
        errorSequenceNumber = errorGameModel.getErrorSequenceNumber();
        gameId = errorGameModel.getGameId();
        gamePlatform = errorGameModel.getGamePlatform();

        ErrorGameResponseDTO errorGameResponseDTO = new ErrorGameResponseDTO( gameId, gamePlatform, errorSequenceNumber, errorCode, errorMessage );

        return errorGameResponseDTO;
    }

    @Override
    public ErrorGame toErrorGameModel(ErrorGameRequestDTO errorGameRequestDTO) {
        if ( errorGameRequestDTO == null ) {
            return null;
        }

        ErrorGame errorGame = new ErrorGame();

        errorGame.setErrorCode( errorGameRequestDTO.getErrorCode() );
        errorGame.setErrorMessage( errorGameRequestDTO.getErrorMessage() );
        errorGame.setGameId( errorGameRequestDTO.getGameId() );
        errorGame.setGamePlatform( errorGameRequestDTO.getGamePlatform() );

        return errorGame;
    }
}
