package methodObject;


import java.util.Objects;

public class Author {
        private String firstName;
        private String secondName;

        public Author(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        @Override
        public String toString() {
            return firstName + " " + secondName;

        }

    @Override
    public boolean equals(Object comparisonAuthor) {
        if (this == comparisonAuthor) return true;
        if (comparisonAuthor == null || getClass() != comparisonAuthor.getClass()) return false;
        Author author = (Author) comparisonAuthor;
        return firstName.equals(author.firstName) && secondName.equals(author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}



