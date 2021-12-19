package br.com.fsantosinfo.compositekeyidclass.model.impl;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ErrorGamePK implements Serializable {

    private static final long serialVersionUID = 2L;

    private Long gameId;

    private String gamePlatform;

    private Long errorSequenceNumber;
}
