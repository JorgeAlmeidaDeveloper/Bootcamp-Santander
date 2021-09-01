package com.dio.controledeacesso.controlle;


import com.dio.controledeacesso.model.JornadaTrabalho;
import com.dio.controledeacesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// servi para um retorno json, pra quem requisitou.
@RequestMapping("/jornada")//procura o endpoint assinalado

public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;


    @PostMapping// inserido dados o create
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @PutMapping // atualizando dados update
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updatesJornada(jornadaTrabalho);

    }

    @GetMapping // listando todos os dados o read
    public List<JornadaTrabalho>  readJornada(){
        return jornadaService.readJornada();
    }

    @GetMapping("{/idJornada}")//listando por Id
    public ResponseEntity<JornadaTrabalho> readJornadaId(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.readJornadaId(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada") ));
    }

    @DeleteMapping("{/idJornada}")//Deletando por Id
    public ResponseEntity<JornadaTrabalho> dltJornadaId(@PathVariable("idJornada") Long idJornada) throws Exception {
     try {
         jornadaService.dltJornada(idJornada);
     }catch (Exception e){
         System.out.println(e.getMessage());
     }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }




    }





