# Patron de Diseño Iterator

## Proposito

El patrón Iterador es un mecanismo de acceso a los elementos que constituyen una estructura de datos para la utilización de estos sin exponer su estructura interna.

## Motivación

El patrón surge del deseo de acceder a los elementos de un contenedor de objetos (por ejemplo, una lista) sin exponer su representación interna. Además, es posible que se necesite más de una forma de recorrer la estructura siendo para ello necesario crear modificaciones en la clase.
La solución que propone el patrón es añadir métodos que permitan recorrer la estructura sin referenciar explícitamente su representación. La responsabilidad del recorrido se traslada a un objeto iterador.
El problema de introducir este objeto iterador reside en que los clientes necesitan conocer la estructura para crear el iterador apropiado.
Esto se soluciona generalizando los distintos iteradores en una abstracción y dotando a las estructuras de datos de un método de fabricación que cree un iterador concreto.

## Aplicabilidad

El patrón iterator permite el acceso al contenido de una estructura sin exponer su representación interna. Además diferentes iteradores pueden presentar diferentes tipos de recorrido sobre la estructura (recorrido de principio a fin, recorrido con saltos...). Por otro lado los iteradores no tienen por qué limitarse a recorrer la estructura, sino que podrían incorporar otro tipo de lógica (por ejemplo, filtrado de elementos). Es más, dados diferentes tipos de estructuras, el patrón iterador permite recorrerlas todas utilizando una interfaz común uniforme

## Consecuencias

El patrón Iterador permite por tanto diferentes tipos de recorrido de un agregado y varios recorridos simultáneos, simplificando la interfaz del agregado.

En los directorios Itrartor1 e Iterartor2 se pueden encontrar ejemplos de dos aplicaciones de este patron de diseño.
