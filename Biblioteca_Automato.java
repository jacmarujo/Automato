import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Biblioteca_Automato {

	public static void main(String[] args) {

		try {
			List<Transicao> transicao = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader("src/ArquivoAutomato.txt"));

			String s = br.readLine();

			while (s.compareTo("-1") != 0) {

				StringTokenizer st = new StringTokenizer(s, " ");

				Transicao t = new Transicao();

				t.setEstadoInicial(Integer.parseInt(st.nextToken()));
				t.setSimbolo(st.nextToken().charAt(0));
				t.setEstadoFinal(Integer.parseInt(st.nextToken()));

				transicao.add(t);

				s = br.readLine();

			}
			Transicao t = new Transicao();
			for (int i = 0; i < transicao.size(); i++) {
				t = transicao.get(i);
				t.imprime();
			}

			int estadoInicial = Integer.parseInt(br.readLine());
			System.out.println("Estado Inicial: " + estadoInicial);

			List<Integer> estadoFinal = new ArrayList<>();
			s = br.readLine();

			StringTokenizer st = new StringTokenizer(s, " ");

			while (st.hasMoreTokens()) {
				estadoFinal.add(Integer.parseInt(st.nextToken()));

			}

			for (int g : estadoFinal) {
				System.out.println("Estado Final: " + g);
			}

			s = br.readLine();
			List<String> listaAceita = new ArrayList<>();

			while (s != null) {
				int i = 0;
				int estadoAtual = estadoInicial;

				while (i < s.length()) {
					char c = s.charAt(i);

					for (Transicao t1 : transicao) {

						if (estadoAtual == t1.getEstadoInicial() && c == t1.getSimbolo()) {
							estadoAtual = t1.getEstadoFinal();
						}
					}
					i++;
				}
				for (int f : estadoFinal) {
					if (estadoAtual == f) {
						listaAceita.add(s);
					}
				}

				s = br.readLine();
			}

			Set<String> listaOrdenada = new HashSet<String>();

			for (String str : listaAceita) {
				listaOrdenada.add(str);// ?????
			}
			System.out.println("Ordem Aceita: ");

			for (String str : listaOrdenada) {
				System.out.println(str);
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
