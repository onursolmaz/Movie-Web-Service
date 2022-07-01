package com.akbank.moviewebservice.service;

import com.akbank.moviewebservice.model.MovieDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class FileService {

    public void writeFile(MovieDetail movieDetail){
        try {
            File file=new File("movies.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter writer=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write(movieDetail.objectAsJson(movieDetail)+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @SneakyThrows
    public MovieDetail readToFile(String id)  {
        File file=new File("movies.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        FileReader reader=new FileReader(file);
        BufferedReader bReader=new BufferedReader(reader);
        String line;
        // to map texts to object
        ObjectMapper mapper=new ObjectMapper();

        while ((line=bReader.readLine())!=null){
            MovieDetail movieDetail = mapper.readValue(line, MovieDetail.class);
            if(movieDetail.getImdbID().equals(id)){
                return movieDetail;
            }
        }
        //if movie not exist in file return null
        return null;
    }
}
