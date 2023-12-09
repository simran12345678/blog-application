package blogappapis.blogapplication.exception;

import blogappapis.blogapplication.payloads.apiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<apiResponse> resourceNotFoundHandler(ResourceNotFoundException ex){
        String message= ex.getMessage();
        apiResponse apiResponse=new apiResponse(message,false);
        return new ResponseEntity<apiResponse>(apiResponse, HttpStatus.NOT_FOUND);
    }

}
