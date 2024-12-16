package pe.edu.i202215291.EF_Dorian_Galvez.response;

import pe.edu.i202215291.EF_Dorian_Galvez.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
