const usuario=

JSON.parse(
localStorage.getItem(
"usuario"
)
);

function proteger(
rolPermitido
){

if(
!usuario
){

location=
"/login";

return;

}

if(
usuario.rol
!==

rolPermitido
){

alert(
"Sin permisos"
);

location="/";

}

}