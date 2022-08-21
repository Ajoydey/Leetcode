/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        boolean[] vis = new boolean[2001];
        int total_imp = dfs(employees, id, vis);
        return total_imp;
    }
        
    public int dfs(List<Employee> employees, int id, boolean[] vis){
        
        if(vis[id])
            return 0;
        int total_so_far = 0;
        for(Employee em: employees)
        {
            if(em.id == id)
            {
                vis[id] = true;
                total_so_far += em.importance;
                
                    for(int sub: em.subordinates)
                    {
                        total_so_far += dfs(employees, sub, vis);
                    }
                
            }
        }
        return total_so_far;
    }
}