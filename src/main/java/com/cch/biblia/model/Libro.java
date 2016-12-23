package com.cch.biblia.model;
/**
 * 
 * Esta clase solo debe tener los set y gets y los atributos(recuerde que son private)
 * ¿cuales atributos poner? guiese con los campos del response del API. deben tener el mismo
 * nombre  
 * 
 * https://es.bibles.org/pages/api/documentation/books
 * {
                "name": "Genesis",
                "parent": {
                    "version": {
                        "path": "/versions/eng-GNTD",
                        "name": "Good News Translation (US Version)",
                        "id": "eng-GNTD"
                    }
                },
                "version_id": "135",
                "next": {
                    "book": {
                        "path": "/books/eng-GNTD:Exod",
                        "name": "Exodus",
                        "id": "eng-GNTD:Exod"
                    }
                },
                "book_group_id": "0",
                "osis_end": "eng-GNTD:Gen.50.26",
                "abbr": "Gen",
                "testament": "OT",
                "ord": "1",
                "copyright": "<p>Good News Translation (Today’s English Version, Second Edition) © 1992 American Bible Society. All rights reserved.</p>",
                "id": "eng-GNTD:Gen"
            },
            
     En algunos casos no es necesario meter todos los campos, por ejemplo en este caso puede omitir parent, book group id, 
     entre otros aunque para hacerlo completo puede incluir todos los campos. notese que campos como parent son en si mismos objetos
 */

public class Libro {

}
