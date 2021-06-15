--------Autores-------------------------------------------------------

Lina Salinas
Juan José Valencia
Jhon Edward Mora

1)---------Compilar y correr Server-------------------------------------

frascati compile server/src CalculoPi-server
frascati run CalculoPi-server -libpath CalculoPi-server.jar

2)---------Compilar y correr Client--------------------------------------

frascati compile client/src CalculoPi-client
frascati run CalculoPi-client -libpath CalculoPi-client.jar -s r -m run