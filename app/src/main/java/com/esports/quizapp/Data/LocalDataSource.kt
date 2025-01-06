package com.esports.quizapp.Data

object LocalDataSource {
    val questions = mutableListOf<Quiz>(
        Quiz(
            "Question Number- 1",
            "What is the sum of 1+1 in binary?",
            listOf(
                "Sum = 2 & Carry = 0",
                "Sum = 1 & Carry = 0",
                "Sum = 0 & Carry = 1",
                "None of above"
            ),
            2
        ),
        Quiz(
            "Question Number- 2",
            "What is the decimal equivalent of binary 1010?",
            listOf("8", "9", "10", "11"),
            2
        ),
        Quiz("Question Number- 3",
            "What is 5 AND 3 in binary?",
            listOf("1", "3", "5", "7"),
            1
        ),
        Quiz(
            "Question Number- 4",
            "Which number system uses base 16?",
            listOf("Binary", "Octal", "Hexadecimal", "Decimal"),
            2
        ),
        Quiz(
            "Question Number- 5",
            "What is the largest digit in hexadecimal?",
            listOf("7", "9", "F", "15"),
            2
        ),
        Quiz(
            "Question Number- 6",
            "What is the 2's complement of binary 1010?",
            listOf("0101", "0110", "1010", "0111"),
            2
        ),
        Quiz(
            "Question Number- 7",
            "What does LSB stand for?",
            listOf(
                "Last Significant Bit",
                "Least Significant Bit",
                "Lower Small Bit",
                "Lowest Sub Bit"
            ),
            1
        ),
        Quiz(
            "Question Number- 8",
            "What is the binary equivalent of the decimal number 15?",
            listOf("1111", "1010", "1110", "1001"),
            0
        ),
        Quiz(
            "Question Number- 9",
            "Which logic gate outputs 1 only if both inputs are 1?",
            listOf("OR", "AND", "XOR", "NOT"),
            1
        ),
        Quiz(
            "Question Number- 10",
            "Which gate is used to invert a binary value?",
            listOf("AND", "OR", "XOR", "NOT"),
            3
        )

    )

    // Computer Science
    val questionsComputerScience = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What is the sum of 1+1 in binary?", listOf("Sum = 2 & Carry = 0", "Sum = 1 & Carry = 0", "Sum = 0 & Carry = 1", "None of the above"), 2),
        Quiz("Question Number- 2", "What is the full form of CPU?", listOf("Central Processing Unit", "Central Programming Unit", "Control Processing Unit", "Central Process Unit"), 0),
        Quiz("Question Number- 3", "Which part of a computer is responsible for arithmetic and logic operations?", listOf("RAM", "Hard Drive", "ALU", "Motherboard"), 2),
        Quiz("Question Number- 4", "What does 'HTTP' stand for?", listOf("Hyper Text Markup Language", "Hyper Text Transfer Protocol", "High Transfer Text Protocol", "Hyper Transfer Text Program"), 1),
        Quiz("Question Number- 5", "What is the main memory of a computer called?", listOf("Hard Drive", "ROM", "RAM", "Cache"), 2),
        Quiz("Question Number- 6", "Which of the following is a primary storage device?", listOf("Hard Disk", "DVD", "RAM", "USB Drive"), 2),
        Quiz("Question Number- 7", "What is the base of the hexadecimal number system?", listOf("2", "8", "10", "16"), 3),
        Quiz("Question Number- 8", "What is an algorithm?", listOf("A type of hardware", "A programming language", "A step-by-step procedure to solve a problem", "A computer virus"), 2),
        Quiz("Question Number- 9", "Which protocol is used to send emails?", listOf("HTTP", "FTP", "SMTP", "POP3"), 2),
        Quiz("Question Number- 10", "What is the smallest unit of data in a computer?", listOf("Bit", "Byte", "Nibble", "Word"), 0)
    )

    // Cricket
    val questionsCricket = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "How many players are there in a cricket team?", listOf("9", "10", "11", "12"), 2),
        Quiz("Question Number- 2", "What is the maximum number of overs in an ODI match?", listOf("20", "50", "100", "90"), 1),
        Quiz("Question Number- 3", "Which country won the first Cricket World Cup in 1975?", listOf("Australia", "England", "India", "West Indies"), 3),
        Quiz("Question Number- 4", "What is the name of the trophy awarded in Ashes series?", listOf("Champions Trophy", "Ashes Trophy", "Border-Gavaskar Trophy", "WTC Trophy"), 1),
        Quiz("Question Number- 5", "What is the term for a bowler taking three wickets in three consecutive deliveries?", listOf("Maiden", "Duck", "Hat-trick", "Runout"), 2),
        Quiz("Question Number- 6", "Which player has the highest individual score in ODI cricket?", listOf("Virat Kohli", "Chris Gayle", "Rohit Sharma", "Sachin Tendulkar"), 2),
        Quiz("Question Number- 7", "What is the length of a cricket pitch?", listOf("18 yards", "20 yards", "22 yards", "24 yards"), 2),
        Quiz("Question Number- 8", "Who is known as the 'God of Cricket'?", listOf("Virat Kohli", "MS Dhoni", "Sachin Tendulkar", "Ricky Ponting"), 2),
        Quiz("Question Number- 9", "What is the term for scoring 100 runs in a single innings?", listOf("Century", "Half-century", "Double century", "Triple century"), 0),
        Quiz("Question Number- 10", "Which bowler has taken the most wickets in Test cricket?", listOf("Muttiah Muralitharan", "Shane Warne", "Anil Kumble", "James Anderson"), 0)
    )

    // Football
    val questionsFootball = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What is the duration of a standard football match?", listOf("80 minutes", "90 minutes", "100 minutes", "120 minutes"), 1),
        Quiz("Question Number- 2", "Which country won the FIFA World Cup in 2018?", listOf("Brazil", "Germany", "France", "Argentina"), 2),
        Quiz("Question Number- 3", "What is the maximum number of players a team can have on the field?", listOf("9", "10", "11", "12"), 2),
        Quiz("Question Number- 4", "What is the term for scoring three goals in a single match?", listOf("Double", "Brace", "Hat-trick", "Treble"), 2),
        Quiz("Question Number- 5", "Which player has won the most Ballon d'Or awards?", listOf("Cristiano Ronaldo", "Lionel Messi", "Neymar", "Ronaldinho"), 1),
        Quiz("Question Number- 6", "Which club is known as 'The Red Devils'?", listOf("Liverpool", "Arsenal", "Manchester United", "Chelsea"), 2),
        Quiz("Question Number- 7", "Who is the all-time top scorer in international football?", listOf("Pele", "Cristiano Ronaldo", "Lionel Messi", "Ali Daei"), 1),
        Quiz("Question Number- 8", "What is the standard size of a football field?", listOf("90x120 meters", "100x130 meters", "105x68 meters", "110x75 meters"), 2),
        Quiz("Question Number- 9", "Which tournament is referred to as the 'Champions League'?", listOf("UEFA Champions League", "Europa League", "FA Cup", "La Liga"), 0),
        Quiz("Question Number- 10", "Which team holds the record for most FIFA World Cup wins?", listOf("Italy", "Germany", "Brazil", "Argentina"), 2)
    )

    // Movies
    val questionsMovies = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "Who directed the movie 'Inception'?", listOf("Steven Spielberg", "Christopher Nolan", "James Cameron", "Martin Scorsese"), 1),
        Quiz("Question Number- 2", "Which movie won the Oscar for Best Picture in 2023?", listOf("Everything Everywhere All at Once", "Avatar 2", "Top Gun: Maverick", "The Whale"), 0),
        Quiz("Question Number- 3", "Who played the role of Iron Man in the Marvel Cinematic Universe?", listOf("Chris Hemsworth", "Robert Downey Jr.", "Chris Evans", "Mark Ruffalo"), 1),
        Quiz("Question Number- 4", "Which is the highest-grossing movie of all time?", listOf("Avatar", "Titanic", "Avengers: Endgame", "The Lion King"), 0),
        Quiz("Question Number- 5", "What is the name of the wizarding school in Harry Potter?", listOf("Beauxbatons", "Hogwarts", "Durmstrang", "Ilvermorny"), 1),
        Quiz("Question Number- 6", "Which actor played the Joker in 'The Dark Knight'?", listOf("Joaquin Phoenix", "Jack Nicholson", "Heath Ledger", "Jared Leto"), 2),
        Quiz("Question Number- 7", "Which movie series features a ring that must be destroyed?", listOf("Star Wars", "Harry Potter", "The Lord of the Rings", "The Matrix"), 2),
        Quiz("Question Number- 8", "Who directed the movie 'Pulp Fiction'?", listOf("Martin Scorsese", "Quentin Tarantino", "Stanley Kubrick", "Francis Ford Coppola"), 1),
        Quiz("Question Number- 9", "Which animated movie features the character 'Simba'?", listOf("Finding Nemo", "The Lion King", "Shrek", "Toy Story"), 1),
        Quiz("Question Number- 10", "What is the title of the first Star Wars movie released?", listOf("The Phantom Menace", "The Empire Strikes Back", "A New Hope", "Return of the Jedi"), 2)
    )

    // Programming
    val questionsProgramming = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What is the extension of a Kotlin file?", listOf(".java", ".kt", ".kotlin", ".py"), 1),
        Quiz("Question Number- 2", "Which programming language is known as the backbone of Android development?", listOf("Python", "Java", "Kotlin", "C++"), 2),
        Quiz("Question Number- 3", "What does 'HTML' stand for?", listOf("Hypertext Markup Language", "Hyper Tool Markup Language", "HighText Machine Language", "None of the above"), 0),
        Quiz("Question Number- 4", "Which language is primarily used for iOS app development?", listOf("Swift", "Kotlin", "Java", "Python"), 0),
        Quiz("Question Number- 5", "What is the main purpose of an IDE?", listOf("To browse the internet", "To debug hardware", "To provide tools for software development", "To create databases"), 2),
        Quiz("Question Number- 6", "What does 'OOP' stand for?", listOf("Objective-Oriented Programming", "Object-Oriented Programming", "Output-Oriented Programming", "Optional Object Programming"), 1),
        Quiz("Question Number- 7", "Which of the following is a valid loop in Kotlin?", listOf("for", "foreach", "loop", "do while"), 0),
        Quiz("Question Number- 8", "Which symbol is used to comment in Kotlin?", listOf("//", "/* */", "#", "All of the above"), 3),
        Quiz("Question Number- 9", "What is the default value of a boolean in Kotlin?", listOf("true", "false", "null", "undefined"), 1),
        Quiz("Question Number- 10", "What is the entry point of a Kotlin program?", listOf("start()", "main()", "run()", "init()"), 1)
    )

    // Mathematics
    val questionsMathematics = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What is the value of π (pi) approximately?", listOf("2.14", "3.14", "4.14", "5.14"), 1),
        Quiz("Question Number- 2", "What is 7 × 8?", listOf("48", "54", "56", "64"), 2),
        Quiz("Question Number- 3", "What is the square root of 144?", listOf("10", "11", "12", "13"), 2),
        Quiz("Question Number- 4", "What is 15% of 200?", listOf("25", "30", "35", "40"), 1),
        Quiz("Question Number- 5", "What is 9²?", listOf("72", "81", "99", "108"), 1),
        Quiz("Question Number- 6", "What is the formula for the area of a circle?", listOf("πr²", "2πr", "πd", "r²"), 0),
        Quiz("Question Number- 7", "What is the derivative of x²?", listOf("2x", "x²", "x", "2"), 0),
        Quiz("Question Number- 8", "What is the value of 0 factorial (0!)?", listOf("0", "1", "-1", "Undefined"), 1),
        Quiz("Question Number- 9", "What is the product of 13 and 6?", listOf("65", "72", "78", "84"), 2),
        Quiz("Question Number- 10", "What is 10³?", listOf("10", "100", "1000", "10000"), 2)
    )

    // Physics
    val questionsPhysics = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What is the speed of light in a vacuum?", listOf("300,000 km/s", "150,000 km/s", "400,000 km/s", "100,000 km/s"), 0),
        Quiz("Question Number- 2", "Who formulated the law of gravitation?", listOf("Newton", "Einstein", "Galileo", "Kepler"), 0),
        Quiz("Question Number- 3", "What is the SI unit of force?", listOf("Pascal", "Newton", "Joule", "Watt"), 1),
        Quiz("Question Number- 4", "What is the acceleration due to gravity on Earth?", listOf("8.9 m/s²", "9.8 m/s²", "10 m/s²", "11 m/s²"), 1),
        Quiz("Question Number- 5", "Which color of light has the shortest wavelength?", listOf("Red", "Blue", "Violet", "Green"), 2),
        Quiz("Question Number- 6", "What is the first law of thermodynamics about?", listOf("Energy conservation", "Entropy increase", "Force and motion", "Magnetic fields"), 0),
        Quiz("Question Number- 7", "What is the SI unit of electric current?", listOf("Volt", "Ampere", "Ohm", "Watt"), 1),
        Quiz("Question Number- 8", "Which particle has no charge?", listOf("Proton", "Neutron", "Electron", "Positron"), 1),
        Quiz("Question Number- 9", "Who discovered radioactivity?", listOf("Marie Curie", "Henri Becquerel", "Rutherford", "Einstein"), 1),
        Quiz("Question Number- 10", "What type of lens is used to correct myopia?", listOf("Convex", "Concave", "Cylindrical", "Spherical"), 1)
    )

    // Chemistry
    val questionsChemistry = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What is the chemical symbol for gold?", listOf("Au", "Ag", "Pb", "Fe"), 0),
        Quiz("Question Number- 2", "What is the pH of pure water?", listOf("6", "7", "8", "9"), 1),
        Quiz("Question Number- 3", "Which gas is released during photosynthesis?", listOf("Carbon dioxide", "Oxygen", "Nitrogen", "Methane"), 1),
        Quiz("Question Number- 4", "What is the main component of natural gas?", listOf("Methane", "Ethane", "Propane", "Butane"), 0),
        Quiz("Question Number- 5", "What is the atomic number of hydrogen?", listOf("1", "2", "3", "4"), 0),
        Quiz("Question Number- 6", "What is the chemical formula of water?", listOf("H2O", "CO2", "O2", "H2O2"), 0),
        Quiz("Question Number- 7", "Which acid is found in lemons?", listOf("Acetic acid", "Citric acid", "Lactic acid", "Sulfuric acid"), 1),
        Quiz("Question Number- 8", "What is the process of turning solid directly into gas?", listOf("Melting", "Evaporation", "Sublimation", "Condensation"), 2),
        Quiz("Question Number- 9", "Which element has the symbol 'Na'?", listOf("Nitrogen", "Sodium", "Neon", "Nickel"), 1),
        Quiz("Question Number- 10", "What is the molecular formula of glucose?", listOf("C6H6", "C6H12O6", "CH4", "C12H22O11"), 1)
    )

    // Biology
    val questionsBiology = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "Which organ filters blood in the human body?", listOf("Heart", "Kidney", "Liver", "Lungs"), 1),
        Quiz("Question Number- 2", "What is the basic unit of life?", listOf("Tissue", "Organ", "Cell", "Molecule"), 2),
        Quiz("Question Number- 3", "What is the powerhouse of the cell?", listOf("Nucleus", "Ribosome", "Mitochondria", "Golgi apparatus"), 2),
        Quiz("Question Number- 4", "Which organ is responsible for insulin production?", listOf("Liver", "Kidney", "Pancreas", "Stomach"), 2),
        Quiz("Question Number- 5", "What is the largest organ in the human body?", listOf("Heart", "Skin", "Liver", "Lungs"), 1),
        Quiz("Question Number- 6", "What type of blood cells fight infections?", listOf("Red blood cells", "White blood cells", "Platelets", "Plasma"), 1),
        Quiz("Question Number- 7", "What is the function of hemoglobin?", listOf("Transport oxygen", "Digest food", "Fight infections", "Clot blood"), 0),
        Quiz("Question Number- 8", "Which vitamin is produced when skin is exposed to sunlight?", listOf("Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D"), 3),
        Quiz("Question Number- 9", "What is the smallest bone in the human body?", listOf("Stapes", "Femur", "Radius", "Humerus"), 0),
        Quiz("Question Number- 10", "What is the process by which plants make food?", listOf("Respiration", "Photosynthesis", "Digestion", "Absorption"), 1)
    )


    // Economics
    val questionsEconomics = mutableListOf<Quiz>(
        Quiz("Question Number- 1", "What does GDP stand for?", listOf("Gross Domestic Product", "Global Domestic Product", "Gross Development Product", "Global Development Program"), 0),
        Quiz("Question Number- 2", "What is the basic problem of economics?", listOf("Unlimited resources", "Scarcity of resources", "Inflation", "Globalization"), 1),
        Quiz("Question Number- 3", "Which type of market has only one seller?", listOf("Monopoly", "Oligopoly", "Perfect competition", "Monopsony"), 0),
        Quiz("Question Number- 4", "What is the term for the total value of goods and services produced in a country?", listOf("National Income", "Gross Domestic Product", "Net National Product", "Per Capita Income"), 1),
        Quiz("Question Number- 5", "What is 'Inflation'?", listOf("A decrease in overall price levels", "An increase in overall price levels", "Stable price levels", "None of the above"), 1),
        Quiz("Question Number- 6", "What does 'microeconomics' study?", listOf("The economy as a whole", "Individual consumers and firms", "Global trade", "National policies"), 1),
        Quiz("Question Number- 7", "What is a 'substitute good'?", listOf("A good that can replace another", "A good used together with another", "A good that has no alternative", "A luxury good"), 0),
        Quiz("Question Number- 8", "What is 'demand' in economics?", listOf("The desire to buy a product", "The ability to sell a product", "The desire and ability to purchase a product", "The quantity of a product supplied"), 2),
        Quiz("Question Number- 9", "What is the primary function of money?", listOf("Store of value", "Unit of account", "Medium of exchange", "All of the above"), 3),
        Quiz("Question Number- 10", "What does the term 'opportunity cost' mean?", listOf("The profit earned from a choice", "The cost of the next best alternative foregone", "The total expense of a project", "The cost of resources"), 1)
    )


}