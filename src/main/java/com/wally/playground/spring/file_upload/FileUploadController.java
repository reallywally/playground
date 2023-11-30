package com.wally.playground.spring.file_upload;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class FileUploadController {


    @PostMapping("/file-upload")
    public void upload(@RequestBody MultipartFile file) {
        WebClient webClient = WebClient.builder()
                .baseUrl("www.test.com")
                .defaultHeader("Content-Type", "application/json")
                .build();

        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("image", file.getResource());

        Map block = webClient.post()
                .uri("/v1/image/alimtalk/template")
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(builder.build()))
                .retrieve()
                .bodyToMono(Map.class)
                .block();
    }

}
