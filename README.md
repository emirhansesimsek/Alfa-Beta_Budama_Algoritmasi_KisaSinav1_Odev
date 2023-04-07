# Alfa-Beta Budama Algoritması
### Alfa-Beta Budama Algoritması Amacı, Ne İçin Kullanıldığı/Kullanılabileceği Ve Çalışma Şekli Aşağıdaki Gibidir:
Alfa-beta budama algoritması, genellikle yapay zeka, oyun teorisi, arama problemleri gibi alanlarda kullanılan bir optimizasyon algoritmasıdır. Amacı, oyun ağacı gibi bir yapı üzerinde en iyi hamleleri bulmaktır.Algoritma, minimax algoritmasının geliştirilmiş bir versiyonudur. Minimax algoritması, bir oyuncunun maksimum kazanç sağlamasını veya minimum kayıp yaşamasını sağlamak için en iyi hamleleri seçtiği bir stratejidir. Ancak, minimax algoritması her zaman tüm olası hamleleri incelemek zorunda olduğundan, arama zamanı çok uzun olabilir. Alfa-beta budama algoritması, minimax algoritmasını geliştirerek, ağaç yapısı içindeki gereksiz dalları atlayarak arama süresini kısaltır.


Algoritmanın Çalışma Şekli Şu Şekildedir:


    1-Başlangıçta, ağaç kök düğümüne kadar inilir ve bir maksimum veya minimum düğüm olup olmadığına bakılır.
   
    2-Maksimum düğümdeysek, tüm alt düğümleri ziyaret eder ve bu alt düğümlerin minimum düğümleri ile işlem yapar.
    
    3-Minimum düğümdeysek, tüm alt düğümleri ziyaret eder ve bu alt düğümlerin maksimum düğümleri ile işlem yapar.
    
    4-Her seviyede alfa ve beta değerleri güncellenir. Alfa değeri, bir maksimum düğümde, en büyük değere sahip düğümün değeridir. Beta değeri, bir minimum düğümde, en küçük değere sahip düğümün değeridir.
   
    5-Alfa-beta budama, gereksiz dalları atlayarak arama zamanını kısaltır. Örneğin, bir dallar kümesindeki en iyi hamlenin diğer dallarda en iyi hamleden daha kötü olduğu belirlenirse, diğer dallar keşfedilmez.
   
    6-Algoritma, ağacın tüm dallarını keşfetmeden, en iyi hamleyi belirlemek için en az sayıda düğümü keşfeder.


Bu şekilde, alfa-beta budama algoritması, minimax algoritmasına göre daha hızlı ve verimlidir. Ancak, algoritmanın doğru sonuç vermesi için, ağaçtaki tüm hamlelerin değerleri doğru bir şekilde hesaplanmalıdır. 

Alfa-beta budama algoritması, yapay zeka alanında genellikle oyunlarda kullanılır. Örneğin, satranç, othello, go gibi strateji oyunlarında kullanılarak bilgisayarın en iyi hamleleri bulması sağlanır. Ayrıca; arama problemleri, yapay sinir ağları, veri madenciliği gibi alanlarda da kullanılabilir.


### Alfa-Beta Budama Algoritması Çalışma Zamanı Analizi ve En iyi, En Kötü, Ortalama Sınırları Açıklamalı Olarak Belirtilecektir. Sadece Sınır Belirtilmeyecektir, Nasıl Bulunduğu Anlatılacaktır:

Alfa-beta budama algoritmasının çalışma zamanı analizi, ağacın büyüklüğüne, derinliğine ve dallanma faktörüne bağlıdır. Dallanma faktörü, bir düğümdeki alt düğümlerin sayısıdır. Algoritmanın çalışma zamanını, Alfa ve beta değerlerinin etkisi ve Ağacın yapısı etkiler.

    1-En iyi durum: Ağacın yapısı, alfa-beta budama algoritması için en iyi durumu oluşturur. Algoritma, gereksiz dalları atlayarak en iyi hamleyi hızlı bir şekilde bulur. Bu durumda, algoritmanın çalışma zamanı O(b^(d/2)) şeklinde ifade edilebilir. burada b, dallanma faktörü ve d, ağacın derinliğidir.
    
    2-Ortalama durum: Ağacın yapısı, alfa-beta budama algoritması için ortalama durumu oluşturur. Bu durumda, algoritma gereksiz dalları atlayarak en iyi hamleyi bulur. Algoritmanın çalışma zamanı, O(b^(d/2)) ile O(b^d) arasında bir yerdedir.
    
    3-En kötü durum: Ağacın yapısı, alfa-beta budama algoritması için en kötü durumu oluşturur. Bu durumda, algoritmanın tüm dalları keşfetmesi gerekir. Bu durumda, algoritmanın çalışma zamanı O(b^d) şeklinde ifade edilebilir.
    
Alfa-beta budama algoritması, gereksiz dalları atlayarak arama zamanını kısaltır. En iyi durumda, ağaç yapısı, arama zamanını minimuma indirir. En kötü durumda, ağaç yapısı, arama zamanını maksimuma çıkarır.

