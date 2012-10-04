CREATE TABLE "WL_COUNTIES"

(

"C_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
"NAME" VARCHAR(50)
);


CREATE TABLE "WL_TOWNS"

(

"T_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
"C_ID" INT,     
"NAME" VARCHAR(50)
);