
/**
 *
 * @author GigiEsc
 */
public class Tarea6 {

	//Realizar la siguiente funcion recursiva
	//ejercicio1(n) = ejercicio1(n-1) + ejercicio1(n-2)
	//Dados los siguientes caso base
	//ejercicio1(0)=0
	//ejercicio1(1)=1
	static int ejercicio1(int n)
	{
		//Aqui declaramos que cuando n sea cero que devuelva cero
            if (n==0)
                return 0; 
                //Y cuando n sea igual que uno, que devuelva uno. 
            if (n==1)
                return 1; 
                //Al final es que devuelva que n que es nuestro valor 
                //se reste con 1 y que se sume la resta de n -2
            return ejercicio1(n-1) + ejercicio1(n-2); 
	}
	
        
        
	
	//Realizar la siguiente funcion recursiva
	//ejercicio2(n) = ejercicio2(n-1) - ejercicio2(n-2)
	//Dados los siguientes caso base
	//ejercicio2(0)=2
	//ejercicio2(1)=3
	static int ejercicio2(int n)
	{
         //Nuestro valor n, cuando sea 0 que imprima 2,      
	if (n==0)
            return 2; 
        // pero cuando sea 1 que imprima 3. 
        if (n==1)
            return 3; 
        //Luego con los demas valores que devuelva nuestra formula recursiva. 
            return ejercicio2 (n-1) - ejercicio2 (n-2);
	}
	
        
        
        
        
	//Realizar la siguiente funcion recursiva
	//ejercicio3(n) = ejercicio3(n-1) * ejercicio3(n-2) - ejercicio3(n-2) + 12
	//Dados los siguientes caso base
	//ejercicio3(0)=0
	//ejercicio3(1)=1
	//ejercicio3(2)=2
	static int ejercicio3(int n)
	{
            //Ya en nuestra ultima formula tenemos 3 valores
            //Lo que queremos es que imprima cuando sea 0 = 0, 
            // cuando sea 1 = 1, para cuando sea 2 que salga 2 
            
	if (n==0)
            return 0;
        if (n==1)
            return 1; 
        if (n==2)
            return 2;
            // Para todos los demas que sigan la formula que tenemos 
            // Que se resta ya sea por 1 o por 2, que se multipliquen 
            // y se sume 12 
        return ejercicio3(n-1) * ejercicio3(n-2) - ejercicio3(n-2) + 12; 
	}
	

        public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
