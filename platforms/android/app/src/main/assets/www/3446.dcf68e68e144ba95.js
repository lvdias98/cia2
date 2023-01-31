"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[3446],{3446:(Z,T,m)=>{m.r(T),m.d(T,{startInputShims:()=>E});var D=m(5861),b=m(8416),v=m(5730);const p=new WeakMap,w=(e,n,t,s=0,o=!1)=>{p.has(e)!==t&&(t?N(e,n,s,o):O(e,n))},P=e=>e===e.getRootNode().activeElement,N=(e,n,t,s=!1)=>{const o=n.parentNode,r=n.cloneNode(!1);r.classList.add("cloned-input"),r.tabIndex=-1,s&&(r.disabled=!0),o.appendChild(r),p.set(e,r);const i="rtl"===e.ownerDocument.dir?9999:-9999;e.style.pointerEvents="none",n.style.transform=`translate3d(${i}px,${t}px,0) scale(0)`},O=(e,n)=>{const t=p.get(e);t&&(p.delete(e),t.remove()),e.style.pointerEvents="",n.style.transform=""},A="input, textarea, [no-blur], [contenteditable]",H=function(){var e=(0,D.Z)(function*(n,t,s,o,r,c=!1){if(!s&&!o)return;const i=((e,n,t)=>{var s;return((e,n,t,s)=>{const o=e.top,r=e.bottom,c=n.top,d=c+15,S=.75*Math.min(n.bottom,s-t)-r,l=d-o,h=Math.round(S<0?-S:l>0?-l:0),_=Math.min(h,o-c),u=Math.abs(_)/.3;return{scrollAmount:_,scrollDuration:Math.min(400,Math.max(150,u)),scrollPadding:t,inputSafeY:4-(o-d)}})((null!==(s=e.closest("ion-item,[ion-item]"))&&void 0!==s?s:e).getBoundingClientRect(),n.getBoundingClientRect(),t,e.ownerDocument.defaultView.innerHeight)})(n,s||o,r);if(s&&Math.abs(i.scrollAmount)<4)t.focus();else if(w(n,t,!0,i.inputSafeY,c),t.focus(),(0,v.r)(()=>n.click()),typeof window<"u"){let d;const f=function(){var l=(0,D.Z)(function*(){void 0!==d&&clearTimeout(d),window.removeEventListener("ionKeyboardDidShow",S),window.removeEventListener("ionKeyboardDidShow",f),s&&(yield(0,b.c)(s,0,i.scrollAmount,i.scrollDuration)),w(n,t,!1,i.inputSafeY),t.focus()});return function(){return l.apply(this,arguments)}}(),S=()=>{window.removeEventListener("ionKeyboardDidShow",S),window.addEventListener("ionKeyboardDidShow",f)};if(s){const l=yield(0,b.g)(s);if(i.scrollAmount>l.scrollHeight-l.clientHeight-l.scrollTop)return"password"===t.type?(i.scrollAmount+=50,window.addEventListener("ionKeyboardDidShow",S)):window.addEventListener("ionKeyboardDidShow",f),void(d=setTimeout(f,1e3))}f()}});return function(t,s,o,r,c){return e.apply(this,arguments)}}(),B="$ionPaddingTimer",C=(e,n)=>{var t,s;if("INPUT"!==e.tagName||e.parentElement&&"ION-INPUT"===e.parentElement.tagName||"ION-SEARCHBAR"===(null===(s=null===(t=e.parentElement)||void 0===t?void 0:t.parentElement)||void 0===s?void 0:s.tagName))return;const o=(0,b.f)(e);if(null===o)return;const r=o[B];r&&clearTimeout(r),n>0?o.style.setProperty("--keyboard-offset",`${n}px`):o[B]=setTimeout(()=>{o.style.setProperty("--keyboard-offset","0px")},120)},E=(e,n)=>{const t=document,s="ios"===n,o="android"===n,r=e.getNumber("keyboardHeight",290),c=e.getBoolean("scrollAssist",!0),i=e.getBoolean("hideCaretOnScroll",s),d=e.getBoolean("inputBlurring",s),f=e.getBoolean("scrollPadding",!0),S=Array.from(t.querySelectorAll("ion-input, ion-textarea")),l=new WeakMap,h=new WeakMap,_=function(){var u=(0,D.Z)(function*(a){yield new Promise(L=>(0,v.c)(a,L));const I=a.shadowRoot||a,g=I.querySelector("input")||I.querySelector("textarea"),y=(0,b.f)(a),x=y?null:a.closest("ion-footer");if(g){if(y&&i&&!l.has(a)){const L=((e,n,t)=>{if(!t||!n)return()=>{};const s=i=>{P(n)&&w(e,n,i)},o=()=>w(e,n,!1),r=()=>s(!0),c=()=>s(!1);return(0,v.a)(t,"ionScrollStart",r),(0,v.a)(t,"ionScrollEnd",c),n.addEventListener("blur",o),()=>{(0,v.b)(t,"ionScrollStart",r),(0,v.b)(t,"ionScrollEnd",c),n.addEventListener("ionBlur",o)}})(a,g,y);l.set(a,L)}if("date"!==g.type&&"datetime-local"!==g.type&&(y||x)&&c&&!h.has(a)){const L=((e,n,t,s,o,r=!1)=>{let c;const i=f=>{c=(0,v.p)(f)},d=f=>{if(!c)return;const S=(0,v.p)(f);!((e,n,t)=>{if(n&&t){const s=n.x-t.x,o=n.y-t.y;return s*s+o*o>e*e}return!1})(6,c,S)&&!P(n)&&H(e,n,t,s,o,r)};return e.addEventListener("touchstart",i,{capture:!0,passive:!0}),e.addEventListener("touchend",d,!0),()=>{e.removeEventListener("touchstart",i,!0),e.removeEventListener("touchend",d,!0)}})(a,g,y,x,r,o);h.set(a,L)}}});return function(I){return u.apply(this,arguments)}}();d&&(()=>{let e=!0,n=!1;const t=document;(0,v.a)(t,"ionScrollStart",()=>{n=!0}),t.addEventListener("focusin",()=>{e=!0},!0),t.addEventListener("touchend",c=>{if(n)return void(n=!1);const i=t.activeElement;if(!i||i.matches(A))return;const d=c.target;d!==i&&(d.matches(A)||d.closest(A)||(e=!1,setTimeout(()=>{e||i.blur()},50)))},!1)})(),f&&(e=>{const n=document;n.addEventListener("focusin",o=>{C(o.target,e)}),n.addEventListener("focusout",o=>{C(o.target,0)})})(r);for(const u of S)_(u);t.addEventListener("ionInputDidLoad",u=>{_(u.detail)}),t.addEventListener("ionInputDidUnload",u=>{(u=>{if(i){const a=l.get(u);a&&a(),l.delete(u)}if(c){const a=h.get(u);a&&a(),h.delete(u)}})(u.detail)})}}}]);