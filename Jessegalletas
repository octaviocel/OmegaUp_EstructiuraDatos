#include <bits/stdc++.h>
typedef long long ll;
using namespace std;


ll cook(ll k, vector<ll> A) {
    
    ll contador = 0;
    priority_queue <ll, vector<ll>, greater<ll> > m;
    for(ll temp:A){
        m.push(temp);
    }
    while (!m.empty()){
        if(m.top()<k){
            ll min1=m.top();
            minhp.pop();
            if(!m.empty()){
                ll min2=m.top();
                m.pop();
                ll nuevo=min1+2*min2;
                m.push(nuevo);
                contador++;
            }else{
                return -1LL;
            }
        }else{
            return contador;
        }
    }
    return -1LL;
}

int main() {
    ll N, K;
    scanf("%lld %lld", &N,&K);
    vector<ll> galletas;
    for(ll i = 0; i<N; i++){
        ll temp;
        scanf("%lld",&temp);
        galletas.push_back(temp);
    }
    printf("%lld",cook(K,galletas));

}
