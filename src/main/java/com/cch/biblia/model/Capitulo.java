package com.cch.biblia.model;

/**
 * 
 * Esta clase solo debe tener los set y gets y los atributos(recuerde que son private)
 * ¿cuales atributos poner? guiese con los campos del response del API. deben tener el mismo
 * nombre 
 * 
 * https://es.bibles.org/pages/api/documentation/chapters
 * "chapters": [
            {
                "chapter": "1",
                "copyright": "<p>Good News Translation (Today’s English Version, Second Edition) © 1992 American Bible Society. All rights reserved.</p>",
                "parent": {
                    "book": {
                        "path": "/books/eng-GNTD:2Tim",
                        "name": "2 Timothy",
                        "id": "eng-GNTD:2Tim"
                    }
                },
                "label": "",
                "auditid": "0",
                "osis_end": "eng-GNTD:2Tim.1.18",
                "next": {
                    "chapter": {
                        "path": "/chapters/eng-GNTD:2Tim.2",
                        "name": "2 Timothy 2",
                        "id": "eng-GNTD:2Tim.2"
                    }
                },
                "id": "eng-GNTD:2Tim.1",
                "previous": {
                    "chapter": {
                        "path": "/chapters/eng-GNTD:1Tim.6",
                        "name": "1 Timothy 6",
                        "id": "eng-GNTD:1Tim.6"
                    }
                }
            }
 * 
 *
 */
public class Capitulo {

}
