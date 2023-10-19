// import java.util.Calendar;

public class Colores {

  public static void main(String[] args) throws Exception {
    System.out.print("\033[32m hierba");
    System.out.print("\033[31m tomate");
    System.out.print("\033[37m sábanas");
    System.out.print("\033[36m cielo");
    System.out.print("\033[35m nazareno");
    System.out.print("\033[34m mar");
    System.out.println(ConsoleColors.RESET);

    System.out.println("┌────────┬───────────┬────────┬────────────────┐");
    System.out.println("│ Código │   Color   │ Código │     Color      │");
    System.out.println("├────────┼───────────┼────────┼────────────────┤");
    System.out.print("│   30   │\033[30m  negro   \033[39;49m │");
    System.out.println("   90   │\033[90m  negro claro  \033[39;49m │");
    System.out.print("│   31   │\033[31m  rojo    \033[39;49m │");
    System.out.println("   91   │\033[91m  rojo claro   \033[39;49m │");
    System.out.print("│   32   │\033[32m  verde   \033[39;49m │");
    System.out.println("   92   │\033[92m  verde claro  \033[39;49m │");
    System.out.print("│   33   │\033[33m  amarillo\033[39;49m │");
    System.out.println("   93   │\033[93m  amarillo claro\033[39;49m│");
    System.out.print("│   34   │\033[34m  azul    \033[39;49m │");
    System.out.println("   94   │\033[94m  azul claro   \033[39;49m │");
    System.out.print("│   35   │\033[35m  morado  \033[39;49m │");
    System.out.println("   95   │\033[95m  morado claro \033[39;49m │");
    System.out.print("│   36   │\033[36m  cian    \033[39;49m │");
    System.out.println("   96   │\033[96m  cian claro   \033[39;49m │");
    System.out.print("│   37   │\033[37m  blanco  \033[39;49m │");
    System.out.println("   97   │\033[97m  blanco claro \033[39;49m │");
    System.out.println("└────────┴───────────┴────────┴────────────────┘");

    // System.out.println("\033[31mHello, World!");

    System.out.println(ConsoleColors.PURPLE + "\u266AWriting in purple color𝅘𝅥𝅲");
    System.out.println(
      ConsoleColors.GREEN_BOLD + "Writing in green bold color"
    );
    System.out.println("\u002A\u0026\u1D16\u266A𝅘𝅥𝅲ëÚ");
    char letra = 'A' + 32;
    System.out.println(letra);
    System.out.println(
      ConsoleColors.GREEN +
      ConsoleColors.YELLOW_BACKGROUND +
      "Writing in green bold color" +
      ConsoleColors.BLUE +
      ConsoleColors.CYAN_BACKGROUND +
      "Writing in green bold color"
    );

    // System.out.format(
    //   ConsoleColors.YELLOW_BOLD + "Local Time: %tT",
    //   Calendar.getInstance()
    // );
    System.out.print(ConsoleColors.RESET);
  }
}
