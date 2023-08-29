<h1 align="center" style="color: #333; margin-bottom: 20px;">Implementação do Algoritmo Flood Fill</h1>

<p style="color: #6f42c1; line-height: 1.6; align= center;">O Flood Fill é utilizado na ferramenta de "preenchimento de balde"; de softwares de desenho e em jogos como Go e Campo Minado para limpar posições. Neste projeto, implementaremos uma versão simplificada do algoritmo usando pilhas e filas para armazenamento de dados da matriz.</p>

<br>

<h2 align="center" style="color: #6f42c1; margin-bottom: 20px;">Como fizemos?</h2>

<p style="color: #555; line-height: 1.6; align= center;">Usamos o método simples para criar o FloodFill, utilizando uma matriz no terminal preenchida de números &quot;1&quot; e com uma diagonal principal com números &quot;0&quot;. <br> Ao escolher uma coordenada, os vizinhos dessa coordenada serão automaticamente substituídos por &quot;2&quot; (como se estivessem sendo pintados), com a diagonal sendo o limite.</p>

<br>

<h2 align="center" style="color: #6f42c1; margin-bottom: 20px;">Como funciona?</h2>

<p style="color: #555; line-height: 1.6; align= center;">1- Ao inicializar o código, vai aparecer a opção de escolher [1] Fila ou [2] Pilha <br> 2- Ao escolher uma opção, será necessário informar uma linha e uma coluna. <br>; 3- Depois de escolher a coluna, a matriz será imprimida automaticamente mostrando o preenchimento dos números &quot;1&quot; por &quot;2&quot;.</p>
