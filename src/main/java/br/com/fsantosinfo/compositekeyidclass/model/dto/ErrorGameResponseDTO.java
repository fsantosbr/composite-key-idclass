package br.com.fsantosinfo.compositekeyidclass.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorGameResponseDTO implements Serializable {

    private static final long serialVersionUID = 2L;

    private Long gameId;
    private String gamePlatform;
    private Long errorSequenceNumber;
    private Integer errorCode;
    private String errorMessage;
}
