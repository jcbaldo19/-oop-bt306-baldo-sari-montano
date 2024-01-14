import java.util.InputMismatchException;
import java.util.Scanner;

//Interface for character customization
interface CharacterCustomization {
	
    void customizeName();

    void customizeRace();

    void customizeRace(int userRaceChoice); // Overloaded method

    void customizeSex();

    void customizeSex(int userSexChoice);// Overloaded method

    void customizeFacialStructure();

    void customizeBody();

    void customVoice();

    void customVoice(int userVoiceChoice);// Overloaded method

    void customLanguage();

    void customLanguage(int userLanguageChoice);// Overloaded method

    void customSkinTone();

    void customSkinTone(int userSkinToneChoice);// Overloaded method

    void customHair();

    void customHair(int userHairChoice);// Overloaded method

    void customFacialHair();

    void customFacialHair(int userFacialHairChoice);// Overloaded method

    void customAbilities();

    void customAbilities(int userAbilitiesChoice);// Overloaded method

    void customEmpire();

    void customEmpire(int userEmpireChoice);// Overloaded method

    void customPreferWeapon();

    void customPreferWeapon(int userPreferWeaponChoice);// Overloaded method

    void customPassive();

    void customPassive(int userPassiveChoice);// Overloaded method

    void customPersonality();

    void customPersonality(int userPersonalityChoice);// Overloaded method

    void customTattoos();

    void customTattoos(int userTattoosChoice);// Overloaded method

    void customCompanion();

    void customCompanion(int userCompanionCHoice);// Overloaded method

    void customPower();

    void customPower(int userPowerChoice);// Overloaded method

    void customClothing();

    void customClothing(int userClothingChoice);// Overloaded method

    void customReligion();

    void customReligion(int userReligionChoice);// Overloaded method

}






// Abstract class representing different game modes
abstract class GameMode {

	
    public abstract void storySurvival();

    public abstract void storyCasual();
}

// Player class implementing CharacterCustomization interface and extending
// GameMode abstract class


class Player extends GameMode implements CharacterCustomization {
	
	
	
    private String name;
    private String race;
    private String sex;
    private String skinTone;
    private String hair;
    private String facialHair;
    private String abilities;
    private String language;
    private String empire;
    private String preferWeapon;
    private String passive;
    private String personality;
    private String tattoo;
    private String companion;
    private String power;
    private String voice;
    private String clothing;
    private String religion;
    private Scanner input;

    private int heightscale, weightscale, shoulderscale, wristscale, neckscale;

    private int Nosescale, eyesscale, Jawlinescale, Earsscale, Mouthscale;

 

    Player() {
        // default constructor
    	this.name = "";
        this.race = "";
        this.sex = "";
        this.skinTone = "";
        this.hair = "";
        this.facialHair = "";
        this.abilities = "";
        this.language = "";
        this.empire = "";
        this.preferWeapon = "";
        this.passive = "";
        this.personality = "";
        this.tattoo = "";
        this.companion = "";
        this.power = "";
        this.voice = "";
        this.clothing = "";
        this.religion = "";
        this.heightscale = 0;
        this.weightscale = 0;
        this.wristscale = 0;
        this.neckscale = 0;
        this.Nosescale = 0;
        this.eyesscale = 0;
        this.Jawlinescale = 0;
        this.Earsscale = 0;
        this.Mouthscale = 0;
        this.input = new Scanner(System.in);

   
    }
    // Parameterized constructor

    Player(String name, String race, String sex, String skinTone, String hair, String facialHair,
            String abilities, String language, String empire, String preferWeapon, String passive,
            String personality, String tattoo, String companion, String power, String voice, String clothing,
            String religion, int heightscale, int weightscale, int wristscale, int neckscale, int Nosescale,
            int eyesscale, int Jawlinescale, int Earsscale, int Mouthscale) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.skinTone = skinTone;
        this.hair = hair;
        this.facialHair = facialHair;
        this.abilities = abilities;
        this.language = language;
        this.empire = empire;
        this.preferWeapon = preferWeapon;
        this.passive = passive;
        this.personality = personality;
        this.tattoo = tattoo;
        this.companion = companion;
        this.input = new Scanner(System.in);

   
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getSex() {
        return sex;
    }

    public String getSkinTone() {
        return skinTone;
    }

    public String getHair() {
        return hair;
    }

    public String getFacialHair() {
        return facialHair;
    }

    public String getAbilities() {
        return abilities;
    }

    public String getLanguage() {
        return language;
    }

    public String getEmpire() {
        return empire;
    }

    public String getPreferWeapon() {
        return preferWeapon;
    }

    public String getPassive() {
        return passive;
    }

    public String getPersonality() {
        return personality;
    }

    public String getTattoo() {
        return tattoo;
    }

    public String getCompanion() {
        return companion;
    }

    public String getPower() {
        return power;
    }

    public String getVoice() {
        return voice;
    }

    public String getClothing() {
        return clothing;
    }

    public String getReligion() {
        return religion;
    }

    public int getHeightscale() {
        return heightscale;
    }

    public int getWeightscale() {
        return weightscale;
    }

    public int getWristscale() {
        return wristscale;
    }
    public int getShoulderscale() {
    	return shoulderscale;
    }

    public int getNeckscale() {
        return neckscale;
    }

    public int getNosescale() {
        return Nosescale;
    }

    public int getEyesscale() {
        return eyesscale;
    }

    public int getJawlinescale() {
        return Jawlinescale;
    }

    public int getEarsscale() {
        return Earsscale;
    }

    public int getMouthscale() {
        return Mouthscale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {

        this.race = race;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSkinTone(String skinTone) {
        this.skinTone = skinTone;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setFacialHair(String facialHair) {
        this.facialHair = facialHair;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setEmpire(String empire) {
        this.empire = empire;
    }

    public void setPreferWeapon(String preferWeapon) {
        this.preferWeapon = preferWeapon;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public void setTattoo(String tattoo) {
        this.tattoo = tattoo;
    }

    public void setCompanion(String companion) {
        this.companion = companion;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setHeightscale(int heightscale) {
        this.heightscale = heightscale;
    }

    public void setWeightscale(int weightscale) {
        this.weightscale = weightscale;
    }

    public void setWristscale(int wristscale) {
        this.wristscale = wristscale;
    }

    public void setNeckscale(int neckscale) {
        this.neckscale = neckscale;
    }

    public void setNosescale(int Nosescale) {
        this.Nosescale = Nosescale;
    }

    public void setEyesscale(int eyesscale) {
        this.eyesscale = eyesscale;
    }

    public void setJawlinescale(int Jawlinescale) {
        this.Jawlinescale = Jawlinescale;
    }

    public void setEarsscale(int Earsscale) {
        this.Earsscale = Earsscale;
    }

    public void setMouthscale(int Mouthscale) {
        this.Mouthscale = Mouthscale;
    }
    
    
    

    public void customizeName() {
    
   
   while(true) {
             System.out.print("Enter your character's name: ");
        String playerName = input.nextLine();
       setName(playerName);
       
      if(playerName.equals(null) || playerName.equals("") || playerName.isBlank()){
    	System.out.println("Empty Value");
    	  
      }
      else {
    	  break;
      }
       
   }
    
    }

    
	//
    public void customizeRace() {

        while (race.equals("")) {
            System.out.println("\nRace List");
            System.out.println("(1.Nord, 2.Imperial, 3.Redguard, 4.Breton, 5.Dunmer)");
            System.out.print("Pick your race: ");

            try {
                int userRace = input.nextInt();

                if (userRace >= 1 && userRace <= 5) {
                    setRaceByNumber(userRace);
                } else {
                    System.out.println("Invalid choice. Please pick a valid race (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
    }

    // Overloaded method for customizing based on user's preference
    public void customizeRace(int userRaceChoice) {
        setRaceByNumber(userRaceChoice);
    }

    private void setRaceByNumber(int userRace) {
        if (userRace == 1) {
            race = "Nord";
        } else if (userRace == 2) {
            race = "Imperial";
        } else if (userRace == 3) {
            race = "Redguard";
        } else if (userRace == 4) {
            race = "Breton";
        } else if (userRace == 5) {
            race = "Dunmer";
        }
    }
    // 

    @Override
    public void customizeSex() {
    	   while (sex.equals("")) {
        System.out.println("\nGender");
        System.out.println("1. Male, 2. Female, 3. Lesbian, 4. Bigender, 5. Intersex");
        System.out.print("Choose your gender:");

        try {
            int userSex = input.nextInt();

            if (userSex >= 1 && userSex <= 5) {
                setSexByNumber(userSex);
            } else {
                System.out.println("Invalid choice. Please pick a valid sex (1-5).");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            input.nextLine(); // Consume the invalid input to avoid an infinite loop
        }
    	   }
    }

    @Override
    public void customizeSex(int userSexChoice) {
        setSexByNumber(userSexChoice);

    }

    private void setSexByNumber(int userSex) {
        if (userSex == 1) {
            sex = "Male";
        } else if (userSex == 2) {
            sex = "Female";
        } else if (userSex == 3) {
            sex = "Lesbian";
        } else if (userSex == 4) {
            sex = "Bigender";
        } else if (userSex == 5) {
            sex = "Intersex";
        }
    }

   

        public void customizeFacialStructure() {
            String customizationChoice = "";
            try {
                do {
                    System.out.println("\nFacial Structure");

                    System.out.println("Nose Choose 1-10 scale:");
                    Nosescale = getValidScaleface();

                    System.out.println("Eyes Choose 1-10 scale:");
                     eyesscale = getValidScaleface();

                    System.out.println("Jawline Choose 1-10 scale:");
                     Jawlinescale = getValidScaleface();

                    System.out.println("Ears Choose 1-10 scale:");
                     Earsscale = getValidScaleface();

                    System.out.println("Mouth Choose 1-10 scale:");
                     Mouthscale = getValidScaleface();

                    System.out.println("Do you want to Finalize this customization? (Y/N)");
                   customizationChoice = input.nextLine();
                   if(customizationChoice.equalsIgnoreCase("Y")) {
                	break;
             
                   }
                   
                    if (!customizationChoice.equalsIgnoreCase("Y") && !customizationChoice.equalsIgnoreCase("N") ) {
                        System.out.println("Invalid choice. Please enter either Y or N");
                    }
                   
                } while (!customizationChoice.equalsIgnoreCase("Y") &&!customizationChoice.equalsIgnoreCase("") );
            } catch (InputMismatchException e) {
                System.out.println("Invalid data type");
            }
        }

        private int getValidScaleface() {
            int scale;

            
            do {
                System.out.print("Choose a scale between 1 and 10: ");

                try {
                    scale = input.nextInt();

                    if (scale < 1 || scale > 10) {
                        System.out.println("Invalid input! Please enter a value between 1 and 10.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    input.next(); // Discard invalid input
                    scale = 0;    
                }

            } while (scale < 1 || scale > 10);

            input.nextLine(); // Consume the newline character
          
            return scale;
        }    
        
        public void customizeBody() {
            String customizationChoice = "";
            try {
            do {
                System.out.println("\nBody	");

                System.out.println("Height Choose 1-10 scale:");
                heightscale = getvalidScaleBody();

                System.out.println("weight  choose 1-10 scale:");
                weightscale = getvalidScaleBody();

                System.out.println("shoulder choose 1-10 scale:");
                shoulderscale = getvalidScaleBody();

                System.out.println("wrist choose 1-10 scale:");
                wristscale = getvalidScaleBody();

                System.out.println("neck choose 1-10 scale: ");
                neckscale = getvalidScaleBody();

                System.out.println("Do you want to Finalize this customization? (Y/N)");
                customizationChoice = input.nextLine();
                if(customizationChoice.equalsIgnoreCase("Y")) {
                	break;
             
                   }
                   
                 if (!customizationChoice.equalsIgnoreCase("Y") && !customizationChoice.equalsIgnoreCase("N")) {
                     System.out.println("Invalid choice. Please enter either 'Y' or 'N'");
                 }
             } while (!customizationChoice.equalsIgnoreCase("Y") &&!customizationChoice.equalsIgnoreCase("") );
         } catch (InputMismatchException e) {
             System.out.println("Invalid data type");
         }
        }

        private int getvalidScaleBody() {
            int scale;
            
            do {
                System.out.print("Choose a scale between 1 and 10: ");

                try {
                    scale = input.nextInt();

                    if (scale < 1 || scale > 10) {
                        System.out.println("Invalid input! Please enter a value between 1 and 10.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    input.next(); // Discard invalid input
                    scale = 0;    
                }

            } while (scale < 1 || scale > 10);

            input.nextLine(); // Consume the newline character
          
            return scale;
        }
        

        
    
        



    public void customVoice() {
        while (voice.equals("")) {
            System.out.println("\nVoice");
            System.out.println("1. Male 1, 2. Male 2, 3. Male 3, 4. Female 4, 5. Female 5");
            System.out.print("Choose your voice:");

            try {
                int userVoice = input.nextInt();
                if (userVoice >= 1 && userVoice <= 5) {
                    setVoiceByNumber(userVoice);
                } else {
                    System.out.println("Invalid choice. Please pick a valid voice (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customVoice(int userVoiceChoice) {
        setVoiceByNumber(userVoiceChoice);
    }

    private void setVoiceByNumber(int userVoice) {
        if (userVoice == 1) {
            voice = "Male 1";
        } else if (userVoice == 2) {
            voice = "Male 2";
        } else if (userVoice == 3) {
            voice = "Male 3";
        } else if (userVoice == 4) {
            voice = "Female 4";
        } else if (userVoice == 5) {
            voice = "Female 5";
        }
    }

    public void customLanguage() {
        while (language.equals("")) {
            System.out.println("\nLanguage");
            System.out.println(
                    "1. Dremora - Dremora are powerful, humanoid Daedra associated with the Daedric Prince Mehrunes Dagon.");
            System.out.println(
                    "2. Centurian - These automatons are found in Dwemer ruins, guarding their ancient technology and treasures. They are formidable enemies with powerful attacks.");
            System.out
                    .println("3. Atmoran - they are considered the ancestors of the Nords, the human race in Skyrim.");
            System.out.println(
                    "4. Ald Chimeris - refers to a race of elves before they became the Dunmer in the Elder Scrolls lore.");
            System.out.println(
                    "5. Old Bretic - the ancient language or culture of the Bretons, the human race in the province of High Rock.");

            System.out.print("Choose your Language:");

            try {
                int userLanguage = input.nextInt();

                if (userLanguage >= 1 && userLanguage <= 5) {
                    setLanguageByNumber(userLanguage);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Language (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customLanguage(int userLanguageChoice) {
        setLanguageByNumber(userLanguageChoice);
    }

    private void setLanguageByNumber(int userLanguage) {
        if (userLanguage == 1) {
            language = "Dremora";
        } else if (userLanguage == 2) {
            language = "Centurian";
        } else if (userLanguage == 3) {
            language = "Atmoran";
        } else if (userLanguage == 4) {
            language = "Ald Chimeris";
        } else if (userLanguage == 5) {
            language = "Old Bretic";
        }
    }

    public void customSkinTone() {
        while (skinTone.equals("")) {
            System.out.println("\nSkin Tone");
            System.out.println("1. White, 2. Black, 3. Brown, 4. Yellow, 5. Green");
            System.out.print("Choose your Skin Tone:");

            try {
                int userSkinTone = input.nextInt();
                if (userSkinTone >= 1 && userSkinTone <= 5) {
                    setSkinToneByNumber(userSkinTone);
                } else {
                    System.out.println("Invalid choice. Please pick a valid skin tone (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customSkinTone(int userSkinToneChoice) {
        setSkinToneByNumber(userSkinToneChoice);
    }

    private void setSkinToneByNumber(int userSkinTone) {
        if (userSkinTone == 1) {
            skinTone = "White";
        } else if (userSkinTone == 2) {
            skinTone = "Black";
        } else if (userSkinTone == 3) {
            skinTone = "Brown";
        } else if (userSkinTone == 4) {
            skinTone = "Yellow";
        } else if (userSkinTone == 5) {
            skinTone = "Green";
        } else {
            System.out.println("Invalid choice. Please pick a valid skin tone (1-5).");
        }
    }

    public void customHair() {
        while (hair.equals("")) {
            System.out.println("\nHair Type");
            System.out.println("1. Hair 1, 2. Hair 2, 3. Hair 3, 4. Hair 4, 5. Hair 5");
            System.out.print("Choose your Hair Type:");

            try {
                int userHair = input.nextInt();

                if (userHair >= 1 && userHair <= 5) {
                    setHairByNumber(userHair);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Hair type (1-5).");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customHair(int userHairChoice) {
        setHairByNumber(userHairChoice);
    }

    private void setHairByNumber(int userHair) {
        if (userHair == 1) {
            hair = "1. Hair 1";
        } else if (userHair == 2) {
            hair = "2. Hair 2";
        } else if (userHair == 3) {
            hair = "3. Hair 3";
        } else if (userHair == 4) {
            hair = "4. Hair 4";
        } else if (userHair == 5) {
            hair = "5. Hair 5";
        } else {
            System.out.println("Invalid choice. Please pick a valid Hair type (1-5).");
        }
    }

    public void customFacialHair() {
        while (facialHair.equals("")) {
            System.out.println("\nFacial Hair Type");
            System.out.println("1. Thick Hair, 2. Thin Hair, 3. Wavy Hair, 4. Curly , 5. Mix");
            System.out.print("Choose your Facial Hair Type:");

            try {
                int userFacialHair = input.nextInt();

                if (userFacialHair >= 1 && userFacialHair <= 5) {
                    setFacialHairByNumber(userFacialHair);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Facial Hair type (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customFacialHair(int userFacialHairChoice) {
        setFacialHairByNumber(userFacialHairChoice);
    }

    private void setFacialHairByNumber(int userFacialHair) {
        if (userFacialHair == 1) {
            facialHair = "Thick Hair";
        } else if (userFacialHair == 2) {
            facialHair = "Thin Hair";
        } else if (userFacialHair == 3) {
            facialHair = "Wavy Hair";
        } else if (userFacialHair == 4) {
            facialHair = "Curly";
        } else if (userFacialHair == 5) {
            facialHair = "Mix";
        } else {
            System.out.println("Invalid choice. Please pick a valid Facial Hair type (1-5).");
        }
    }

    public void customAbilities() {
        while (abilities.equals("")) {
            System.out.println("\nAbilities");
            System.out.println("1. Sword, 2. Archery, 3. Speech, 4. Enchanting, 5. Blocking");
            System.out.print("Choose your Abilities:");

            try {
                int userAbilities = input.nextInt();
                if (userAbilities >= 1 && userAbilities <= 5) {
                    setAbilitiesByNumber(userAbilities);
                } else {
                    System.out.println("Invalid choice. Please pick a valid ability (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customAbilities(int userAbilitiesChoice) {
        setAbilitiesByNumber(userAbilitiesChoice);
    }

    private void setAbilitiesByNumber(int userAbilities) {
        if (userAbilities == 1) {
            abilities = "Sword";
        } else if (userAbilities == 2) {
            abilities = "Archery";
        } else if (userAbilities == 3) {
            abilities = "Speech";
        } else if (userAbilities == 4) {
            abilities = "Enchanting";
        } else if (userAbilities == 5) {
            abilities = "Blocking";
        } else {
            System.out.println("Invalid choice. Please pick a valid ability (1-5).");
        }
    }

    public void customEmpire() {
        while (empire.equals("")) {
            System.out.println("\nEmpire");
            System.out.println(
                    "1. Nordic Empire - The Nordic Empire, shaped by the indomitable Nords, spanned the icy landscapes of Skyrim.");
            System.out.println(
                    "2. Alessian Empire - The Alessian Empire, rooted in the Alessian Order's religious fervor, exerted influence over Tamriel during the First Era.");
            System.out.println(
                    "3. Septim Dynasty - The Septim Dynasty, a golden age for the Empire, marked an era of unity under the rule of Tiber Septim and his successors.");
            System.out.println(
                    "4. Reman Dynasty - Following the decline of the Septim Dynasty, the Reman Dynasty emerged as a powerful force. Named after the legendary Reman Cyrodiil.");
            System.out.println(
                    "5. Mede Dynasty - The Mede Dynasty, the contemporary rulers of the Empire, came into prominence after the mysterious demise of the last Septim Emperor.");
            System.out.print("Choose your Empire:");

            try {
                int userEmpire = input.nextInt();
                if (userEmpire >= 1 && userEmpire <= 5) {
                    setEmpireByNumber(userEmpire);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Empire (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customEmpire(int userEmpireChoice) {
        setEmpireByNumber(userEmpireChoice);
    }

    private void setEmpireByNumber(int userEmpire) {
        if (userEmpire == 1) {
            empire = "Nordic Empire";
        } else if (userEmpire == 2) {
            empire = "Alessian Empire";
        } else if (userEmpire == 3) {
            empire = "Septim Dynasty";
        } else if (userEmpire == 4) {
            empire = "Reman Dynasty";
        } else if (userEmpire == 5) {
            empire = "Mede Dynasty";
        } else {
            System.out.println("Invalid choice. Please pick a valid Empire (1-5).");
        }
    }

    public void customPreferWeapon() {
        while (preferWeapon.equals("")) {
            System.out.println("\nPrefer Weapon");
            System.out.println("1. Short sword, 2. Long sword, 3. Hammer, 4. Bow, 5. Axe");
            System.out.print("Choose your Prefer Weapon:");

            try {
                int userPreferWeapon = input.nextInt();
                if (userPreferWeapon >= 1 && userPreferWeapon <= 5) {
                    setPreferWeaponByNumber(userPreferWeapon);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Prefer Weapon (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customPreferWeapon(int userPreferWeaponChoice) {
        setPreferWeaponByNumber(userPreferWeaponChoice);
    }

    private void setPreferWeaponByNumber(int userPreferWeapon) {
        if (userPreferWeapon == 1) {
            preferWeapon = "Short sword";
        } else if (userPreferWeapon == 2) {
            preferWeapon = "Long sword";
        } else if (userPreferWeapon == 3) {
            preferWeapon = "Hammer";
        } else if (userPreferWeapon == 4) {
            preferWeapon = "Bow";
        } else if (userPreferWeapon == 5) {
            preferWeapon = "Axe";
        } else {
            System.out.println("Invalid choice. Please pick a valid Prefer Weapon (1-5).");
        }
    }

    public void customPassive() {
        while (passive.equals("")) {
            System.out.println("\nPassive Skill");
            System.out.println(
                    "1. Frost Resist - Individuals with Frost Resist possess an innate resilience to the biting cold.");
            System.out.println(
                    "2. Imperial Luck - Imperials are known for their diplomatic finesse and versatile skills.");
            System.out.println(
                    "3. Magicka Resist - Harnessing an ancient resistance to arcane energies, those with Magicka Resist defy mystical threats.");
            System.out.println(
                    "4. Disease Resistance - Those with Disease Resistance have honed a rugged immunity to the perils of nature.");
            System.out
                    .println("5. Stone Wall - Those with Stone Wall resilience stand firm against physical assaults.");
            System.out.print("Choose your Passive Skill:");

            try {
                int userPassive = input.nextInt();
                if (userPassive >= 1 && userPassive <= 5) {
                    setPassiveByNumber(userPassive);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Passive (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customPassive(int userPassiveChoice) {
        setPassiveByNumber(userPassiveChoice);
    }

    private void setPassiveByNumber(int userPassive) {
        if (userPassive == 1) {
            passive = "Frost Resist";
        } else if (userPassive == 2) {
            passive = "Imperial Luck";
        } else if (userPassive == 3) {
            passive = "Magicka Resist";
        } else if (userPassive == 4) {
            passive = "Disease Resistance";
        } else if (userPassive == 5) {
            passive = "Stone Wall";
        } else {
            System.out.println("Invalid choice. Please pick a valid Passive (1-5).");
        }
    }

    public void customPersonality() {
        while (personality.equals("")) {
            System.out.println("\nPersonality");
            System.out.println("1. Active, 2. Cheerful, 3. Compassionate, 4. Adventurous, 5. Ambitious");
            System.out.print("Choose your Personality:");

            try {
                int userPersonality = input.nextInt();
                if (userPersonality >= 1 && userPersonality <= 5) {
                    setPersonalityByNumber(userPersonality);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Personality (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customPersonality(int userPersonalityChoice) {
        setPersonalityByNumber(userPersonalityChoice);
    }

    private void setPersonalityByNumber(int userPersonality) {
        if (userPersonality == 1) {
            personality = "Active";
        } else if (userPersonality == 2) {
            personality = "Cheerful";
        } else if (userPersonality == 3) {
            personality = "Compassionate";
        } else if (userPersonality == 4) {
            personality = "Adventurous";
        } else if (userPersonality == 5) {
            personality = "Ambitious";
        } else {
            System.out.println("Invalid choice. Please pick a valid Personality (1-5).");
        }
    }

    //
    public void customTattoos() {

        while (tattoo.equals("")) {
            System.out.println("\nTattoo list");
            System.out.println(
                    "(1.Eagle tattoos, 2.Dragon tattos, 3.Dual Sword tattoos, 4.Face of Woman tattoos, 5.Sword and Shield tattoos, 6.None");
            System.out.print("Pick your tattoos: ");

            try {
                int userTattoo = input.nextInt();

                if (userTattoo >= 1 && userTattoo <= 6) {
                	setTattoosByNumber(userTattoo);
                } else {
                    System.out.println("Invalid choice. Please pick a valid race (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
    }

    // Overloaded method for customizing race based on user's preference
    public void customTattoos(int userTattoosChoice) {
    	setTattoosByNumber(userTattoosChoice);
    }

    private void setTattoosByNumber(int userTattoo) {
        if (userTattoo == 1) {
            tattoo = "Eagle tattoos";
        } else if (userTattoo == 2) {
            tattoo = "Dragon tattos";
        } else if (userTattoo == 3) {
            tattoo = "Dual Sword tattoos";
        } else if (userTattoo == 4) {
            tattoo = "Face of Woman tattoos";
        } else if (userTattoo == 5) {
            tattoo = "Sword and Shield tattoos";
        } else if (userTattoo == 6) {
            tattoo = "None";
        }
    }

    public void customCompanion() {
        while (companion.equals("")) {
            System.out.println("\nCompanion");
            System.out.println("1. Wolf, 2. Dog, 3. Bird, 4. Fairy, 5. Demon");
            System.out.print("Choose your Companion:");

            try {
                int userCompanion = input.nextInt();
                if (userCompanion >= 1 && userCompanion <= 5) {
                    setCompanionByNumber(userCompanion);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Companion (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customCompanion(int userCompanionChoice) {
        setCompanionByNumber(userCompanionChoice);
    }

    private void setCompanionByNumber(int userCompanion) {
        if (userCompanion == 1) {
            companion = "Wolf";
        } else if (userCompanion == 2) {
            companion = "Dog";
        } else if (userCompanion == 3) {
            companion = "Bird";
        } else if (userCompanion == 4) {
            companion = "Fairy";
        } else if (userCompanion == 5) {
            companion = "Demon";
        } else {
            System.out.println("Invalid choice. Please pick a valid Companion (1-5).");
        }
    }

    public void customPower() {
        while (power.equals("")) {
            System.out.println("\nPower");
            System.out.println(
                    "1. Battle Cry - Warriors with Battle Cry carry the thunder of the battlefield in their voice.");
            System.out.println(
                    "2. Voice of Emperor - Possessing the regal charisma of the imperial bloodline, those with the Voice of the Emperor skill can calm the storm of conflict.");
            System.out.println("3. Command Animal - Nature bows to those with the ability to Command Animals.");
            System.out.println(
                    "4. Berserker - Fueled by primal rage, Berserkers charge into battle with unmatched ferocity.");
            System.out.println(
                    "5. Fury - Masters of manipulation, those with the Fury skill sow discord in the hearts of their enemies.");
            System.out.print("Choose your Power:");

            try {
                int userPower = input.nextInt();
                if (userPower >= 1 && userPower <= 5) {
                    setPowerByNumber(userPower);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Power (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customPower(int userPowerChoice) {
        setPowerByNumber(userPowerChoice);
    }

    private void setPowerByNumber(int userPower) {
        if (userPower == 1) {
            power = "Battle Cry";
        } else if (userPower == 2) {
            power = "Voice of Emperor";
        } else if (userPower == 3) {
            power = "Command Animal";
        } else if (userPower == 4) {
            power = "Berserker";
        } else if (userPower == 5) {
            power = "Fury";
        } else {
            System.out.println("Invalid choice. Please pick a valid Power (1-5).");
        }
    }

    public void customClothing() {
        while (clothing.equals("")) {
            System.out.println("\nClothing");
            System.out.println(
                    "1. Light Cloth, 2. Heavy Cloth, 3. Dragon Cloth, 4. Dremora Clothing, 5. Crystal Clothing");
            System.out.print("Choose your Clothing:");

            try {
                int userClothing = input.nextInt();
                if (userClothing >= 1 && userClothing <= 5) {
                    setClothingByNumber(userClothing);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Clothing (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customClothing(int userClothingChoice) {
        setClothingByNumber(userClothingChoice);
    }

    private void setClothingByNumber(int userClothing) {
        if (userClothing == 1) {
            clothing = "Light Cloth";
        } else if (userClothing == 2) {
            clothing = "Heavy Cloth";
        } else if (userClothing == 3) {
            clothing = "Dragon Cloth";
        } else if (userClothing == 4) {
            clothing = "Dremora Clothing";
        } else if (userClothing == 5) {
            clothing = "Crystal Clothing";
        } else {
            System.out.println("Invalid choice. Please pick a valid Clothing (1-5).");
        }
    }

    public void customReligion() {
        while (religion.equals("")) {
            System.out.println("\nReligion");
            System.out.println(
                    "1. Polytheistic - A clandestine sect in Skyrim, the Occult Faith venerates hidden cosmic forces and seeks to unravel the mysteries of the arcane.");
            System.out.println(
                    "2. Occult - The Occult Faith venerates hidden cosmic forces and seeks to unravel the mysteries of the arcane. Followers delve into forbidden knowledge, practicing ancient rituals to commune with otherworldly entities in pursuit of power and enlightenment.");
            System.out.println(
                    "3. Elemental - Devotees of the Elemental Covenant in Skyrim worship the primordial forces of fire, water, earth, and air.");
            System.out.println(
                    "4. Daedra - A fringe religion in Skyrim, the Daedric Cult worships the malevolent Daedra, dark entities from Oblivion.");
            System.out.println(
                    "5. Harmony - The Harmonious Order of Aetherius is a serene and pacifistic sect in Skyrim, dedicated to achieving spiritual harmony.");
            System.out.print("Choose your Religion:");

            try {
                int userReligion = input.nextInt();

                if (userReligion >= 1 && userReligion <= 5) {
                    setReligionByNumber(userReligion);
                } else {
                    System.out.println("Invalid choice. Please pick a valid Religion (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. Thank you!");
                input.nextLine();
            }
        }
    }

    @Override
    public void customReligion(int userReligionChoice) {
        setReligionByNumber(userReligionChoice);
    }

    private void setReligionByNumber(int userReligion) {
        if (userReligion == 1) {
            religion = "Polytheistic";
        } else if (userReligion == 2) {
            religion = "Occult";
        } else if (userReligion == 3) {
            religion = "Elemental";
        } else if (userReligion == 4) {
            religion = "Daedra";
        } else if (userReligion == 5) {
            religion = "Harmony";
        } else {
            System.out.println("Invalid choice. Please pick a valid Religion (1-5).");
        }
    }

    public void storySurvival() {
    	 System.out.println("\nSURVIVAL STORY");
         System.out.println(
                 "In the frigid lands of Skyrim where the icy winds howl and the snow-covered mountains stretch to the horizon, a lone adventurer named  ");
         System.out.println(
                 "found herself thrust into a fight for survival. The harsh climate demanded constant attention to her basic needs, forcing her to navigate");
         System.out.println("a perilous existence in a realm filled with both natural and supernatural threats.");


    }

   public  void storyCasual() {
	   System.out.println("\nCASUAL STORY");
	   System.out.println(
               "In the enchanting realm of Tamriel, where the sunlit landscapes and bustling cities paint a vibrant tapestry, a laid-back adventurer named ");
       System.out.println(
               " set out on a journey without the pressures of survival weighing him down. Unlike the harsh conditions of other worlds, in Tamriel, there was no daily");
       System.out.println(" grind for sustenance, no need to constantly fend off the elements.");

   }
   
    

}

public class SkyrimCreation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        String play;

        System.out.println("\t\t\t========================");
        System.out.println("\t\t\tThe Chronicles of Skyrim");
        System.out.println("\t\t\t========================");

        
        Player player = new Player();
        while (true) {
            System.out.println("\n\t\t\tPress P and Enter to Play");
            play = input.nextLine();

           
            if (play.equalsIgnoreCase("P")) {
                break; 
            } else {
                System.out.println("Invalid option. Please enter 'P'.");
            }
        }

       
        // Customize game mode
        boolean survival ;
        boolean casual ;

        while (true) {
            System.out.println("Do you want to play in Survival Mode? ");
            System.out.println("Type 1 for YES I want to play in Survival ");
            System.out.println("Type 2 for no I want to play in Casual Mode ");

            int userMod;

            try {
                userMod = input.nextInt();

                if (userMod == 1) {
                    survival = true;
                    casual = false;
                    break; 
                } else if (userMod == 2) {
                    casual = true;
                    survival = false;
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter 1 for YES or 2 for NO.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer (1 for YES or 2 for NO).");
                input.nextLine(); 
            }
        }
    	input.nextLine();
        // Customize the player
        player.customizeName();
        player.customizeRace();
        player.customizeSex();
        player.customizeFacialStructure();
        player.customizeBody();
        player.customVoice();
        player.customLanguage();
        player.customSkinTone();
        player.customHair();
        player.customFacialHair();
        player.customAbilities();
        player.customEmpire();
        player.customPreferWeapon();
        player.customPassive();
        player.customPersonality();
        player.customTattoos();
        player.customCompanion();
        player.customPower();
        player.customClothing();
        player.customReligion();

        // Display details 
        
            System.out.println("\nCharacter:");

            System.out.println("Name:" +player.getName());
            System.out.println("Race:" + player.getRace());
            System.out.println("Gender :" +player. getSex());
            System.out.println("Skin Tone  :" + player.getSkinTone());

            System.out.println("\nFacial Structure");
            System.out.println("Nose scale:" + player.getNosescale());
            System.out.println("eyes scale:" + player.getWeightscale());
            System.out.println("Jawline scale:" +player. getShoulderscale());
            System.out.println("Ears scale:" + player.getWristscale());
            System.out.println("Mouth scale:" + player.getNeckscale());

            System.out.println("\nBody");
            System.out.println("Height Scale:" + player.getHeightscale());
            System.out.println("Weight Scale:" + player.getWeightscale());
            System.out.println("Shoulder Scale:" + player.getShoulderscale());
            System.out.println("Wrist Scale:" +player.getWristscale());
            System.out.println("Neck Scale:" + player.getNeckscale());

            System.out.println("\n Hair ");
            System.out.println("Hair Type: " + player.getHair());
            System.out.println("Facial Hair Type: " + player.getFacialHair());

            System.out.println("\nAbilities: " + player.getAbilities());
            System.out.println("Language: " +player. getLanguage());
            System.out.println("Empire: " + player.getEmpire());
            System.out.println("Prefer Weapon: " + player.getPreferWeapon());
            System.out.println("Passive: " + player.getPassive());
            System.out.println("Personality: " + player.getPersonality());

            System.out.println("\nTattoo: " + player.getTattoo());

            System.out.println("\nCompanion: " + player.getCompanion());
            System.out.println("Power: " + player.getPower());
            System.out.println("Voice: " +player. getVoice());
            System.out.println("Clothing: " + player.getClothing());
            System.out.println("Religion: " + player.getReligion());
            
            if (survival) {
            	player.storySurvival();
            	
        } else if (casual) {
        	player.storyCasual();
           
        }
    }
}