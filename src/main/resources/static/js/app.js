fetch("/api/servicios")

.then(r=>r.json())

.then(data=>{

let html="";

data.forEach(s=>{

html+=`

<div class="servicio">

<h3>${s.nombre}</h3>

<p>${s.descripcion}</p>

<p>$${s.precio}</p>

<p>${s.duracionMinutos} min</p>

<button>

Agendar

</button>

</div>

`;

});

document.getElementById(
"servicios"
).innerHTML=html;

});