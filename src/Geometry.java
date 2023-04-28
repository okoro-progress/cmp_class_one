public class Geometry extends Math{

    float areaOfSquare(float length){
        return powTwo(length);
    }

    float areaOfTriangle(float breath, float length){
        return divide(1,2)* multiply(breath, length);
    }

    float areaOfRectangle(float length, float breath){
        return multiply(length, breath);
    }
}
