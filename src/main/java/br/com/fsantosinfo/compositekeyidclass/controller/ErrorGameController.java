package br.com.fsantosinfo.compositekeyidclass.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameRequestDTO;
import br.com.fsantosinfo.compositekeyidclass.model.dto.ErrorGameResponseDTO;
import br.com.fsantosinfo.compositekeyidclass.service.impl.ErrorGameServiceImpl;

@RestController
@RequestMapping("/api/v1/errors")
public class ErrorGameController {

    @Autowired
    private ErrorGameServiceImpl errorGameService;

    @PostMapping
    public ResponseEntity<ErrorGameResponseDTO> saveErrorGame(
            @RequestBody @Valid ErrorGameRequestDTO errorGameRequest) {
        return ResponseEntity.ok().body(this.errorGameService.saveErrorGame(errorGameRequest));
    }

    @GetMapping
    public ResponseEntity<Page<ErrorGameResponseDTO>> findErrorsByGame(
            @RequestParam(name = "size", defaultValue = "100") int size,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "gameId", required = true) Long gameId,
            @RequestParam(name = "gamePlatform", required = true) String gamePlatform) {
        return ResponseEntity.ok().body(this.errorGameService.findErrorsByGame(size, page, gameId, gamePlatform));
    }

    @DeleteMapping
    public <T> ResponseEntity<T> deleteErrorGameByCompositeKey(
            @RequestParam(name = "gameId", required = true) Long gameId,
            @RequestParam(name = "gamePlatform", required = true) String gamePlatform,
            @RequestParam(name = "errorSequenceNumber", required = true) Long errorSequenceNumber) {
        this.errorGameService.deleteErrorGameByCompositeKey(gameId, gamePlatform, errorSequenceNumber);
        return ResponseEntity.noContent().build();
    }

}