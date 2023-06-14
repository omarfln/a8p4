import java.util.Comparator;

class MyComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing m1, Marketing m2) {
        if (m1.getSalesamount() < m2.getSalesamount()) {
            return -1;
        } else if (m1.getSalesamount() > m2.getSalesamount()) {
            return 1;
        } else {
            int employeeNameComparison = m1.getEmployeename().compareToIgnoreCase(m2.getEmployeename());
            if (employeeNameComparison != 0) {
                return employeeNameComparison;
            } else {
                return m1.getEmployeename().compareToIgnoreCase(m2.getEmployeename());
            }
        }
    }
}