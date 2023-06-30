package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Deskjet deskjet = new Deskjet();
        Scanner scanner = new Scanner();
        Laserjet laserjet = new Laserjet();
        Xerox xerox = new Xerox();
        


        Impressora impressora = deskjet;
        Impressora impressoralaser = laserjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = xerox;

        Impressora impressoraEm = em;
        Digitalizadora digitalizadoraEm = em;
        Copiadora copiadoraEm = em;

        impressora.imprimir();
        impressoralaser.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        
        impressoraEm.imprimir();
        digitalizadoraEm.digitalizar();
        copiadoraEm.copiar();

    }
}
