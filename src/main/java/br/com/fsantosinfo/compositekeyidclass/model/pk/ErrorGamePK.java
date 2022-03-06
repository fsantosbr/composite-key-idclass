package br.com.fsantosinfo.compositekeyidclass.model.pk;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorGamePK implements Serializable {

    private static final long serialVersionUID = 2L;

    private Long gameId;

    private String gamePlatform;

    private Long errorSequenceNumber;
}