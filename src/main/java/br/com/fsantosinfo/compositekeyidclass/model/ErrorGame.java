package br.com.fsantosinfo.compositekeyidclass.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import br.com.fsantosinfo.compositekeyidclass.model.pk.ErrorGamePK;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@IdClass(ErrorGamePK.class)
@Table(name = "TB_ERROR_GAME")
public class ErrorGame implements Serializable {

    private static final long serialVersionUID = 2L;

    // The next 3 fields are the composite key from the database. We use the same fields in PK class
    
    @Id
    @Column(name = "GAME_ID")
    private Long gameId;

    @Id
    @Column(name = "GAME_PLATFORM")
    private String gamePlatform;

    @Id
    @Column(name = "ERROR_SEQUENCE_NUMBER")
    private Long errorSequenceNumber;

    @Column(name = "ERROR_CODE")
    private Integer errorCode;

    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;        
}
