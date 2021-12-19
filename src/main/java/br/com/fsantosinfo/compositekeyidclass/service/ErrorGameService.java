package br.com.fsantosinfo.compositekeyidclass.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import br.com.fsantosinfo.compositekeyidclass.model.ErrorGame;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameRequestDTO;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameResponseDTO;
import br.com.fsantosinfo.compositekeyidclass.model.pk.ErrorGamePK;

public interface ErrorGameService {

    ErrorGameResponseDTO saveErrorGame(ErrorGameRequestDTO errorGameRequest);

    ErrorGame findByCompositeKey(ErrorGamePK errorGameId);

    Page<ErrorGameResponseDTO> findErrorsByGame(int size, int page, Long gameId, String gamePlatform);

    Page<ErrorGameResponseDTO> convertPageModelToPageResponseDto(PageRequest pageRequest,
            Page<ErrorGame> pageErrorGameModel);

    void deleteErrorGameByCompositeKey(Long gameId, String gamePlatform, Long errorSequenceNumber);
}
