package io.swagger.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-15T01:13:33.603Z")

@Controller
public class RORCodesApiController implements RORCodesApi {



    public ResponseEntity<Void> rorCodes( @NotNull@ApiParam(value = "RxNorm drug code for search", required = true) @RequestParam(value = "drugCode", required = true) String drugCode,
         @NotNull@ApiParam(value = "SNOMEDCT outcome code for search", required = true) @RequestParam(value = "outcomeCode", required = true) String outcomeCode) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
