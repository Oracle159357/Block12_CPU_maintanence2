Напишите программу моделирования с использованием на языке Java по одному из приведенных ниже вариантов.
В программах класс CPUQueue описывает очередь, класс CPUProcess моделирует поток процессов, а класс CPU – поток обслуживания 
процесса центральным процессором. Очереди, потоки процессов и обслуживание процесса моделируются с помощью объектов
соответствующего класса. Параметры очереди моделируются с помощью алгоритмов вставки и извлечения процесса из очереди. 
Параметром  процесса является интервал времени между двумя последовательными генерациями процессов. 
Параметром процессора является время обслуживания процесса.
  Случайные времена для интервалов между моментами генерации процессов и для времен обслуживания распределены по равномерному закону 
  с заданными верхней и нижней границами (см. метод random() в классе Math). Исходными данными для моделирования являются
  количество процессов, которые должны быть сгенерированы (для каждого потока процессов), а также нижние и верхние границы для потоков.  

Вариант 24
Программа моделирует обслуживание двух потоков процессов с разными параметрами  
тремя центральными процессорами и двумя очередями. Каждый процесс поступает в свою очередь и обслуживается своим процессором. 
Третий процессор берет запрос на обслуживание сначала из первой очереди или (если первая очередь пустая) из второй. 
Определите максимальные длины очередей и проценты процессов первого и второго потока, обслуженные третьим процессором.
