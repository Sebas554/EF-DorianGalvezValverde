package pe.edu.i202215291.EF_Dorian_Galvez.response;

import pe.edu.i202215291.EF_Dorian_Galvez.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
