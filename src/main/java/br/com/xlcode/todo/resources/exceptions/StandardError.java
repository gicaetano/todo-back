package br.com.xlcode.todo.resources.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {

    private Long timestamp;
    private Integer status;
    private String message;

    public StandardError(Long timestamp, Integer status, String message) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
    }
}
