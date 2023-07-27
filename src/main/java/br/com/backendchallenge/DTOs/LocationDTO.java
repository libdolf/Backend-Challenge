package br.com.backendchallenge.DTOs;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocationDTO{
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
}
