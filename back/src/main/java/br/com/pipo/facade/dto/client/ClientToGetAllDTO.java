package br.com.pipo.facade.dto.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientToGetAllDTO implements Serializable {

    private String id;

    private String name;
}
