<h1 color: #333;
    text-align: center;
    margin-bottom: 20px;>Implementação do Algoritmo Flood Fill</h1>
<br>
<p color: #555;
    line-height: 1.6;>O Flood Fill é utilizado na ferramenta de "preenchimento de balde" de softwares de desenho e em jogos como Go e Campo Minado para limpar posições. Neste projeto, implementaremos uma versão simplificada do algoritmo usando pilhas e filas para armazenamento de dados da matriz.</p>
<br>
<h2 color: #333;
    text-align: center;
    margin-bottom: 20px;>Como fizemos?</h2>
<br>
<p color: #555;
    line-height: 1.6;>Usamos o método simples para criar o FloodFill, utilizando uma matriz no terminal preenchida de números "1" e com uma diagonal principal com números "0", Ao escoher uma coordenada, os vizinhos dessa coordenada serão automaticamente substituídos por "2" (Como se estivessem sendo pintados), com a diagonal sendo o limite.</p>
<h2 color: #333;
    text-align: center;
    margin-bottom: 20px;>Como funciona?</h2>
<p color: #555;
    line-height: 1.6;>1- Ao inicializar o código, vai aparecer a opção de escolher [1] Fila ou [2] Pilha <br> 2- Ao escolher uma opção, será necessário informar uma linha e uma coluna. <br> 3- Depois de escolher a coluna, a matriz será imprimida automaticamente mostrando o preenchimento dos números "1" por "2".</p>